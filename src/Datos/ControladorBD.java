/*
 * Esta clase tiene como objetivo proporcionar los métodos de conexión a la base de datos.
*/
package Datos;
 
import Modelo.Cuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
 * @version: 1.0
 */
public class ControladorBD {
   private static final String USER = "root"; 
   private static final String PASSWORD = "root";
   private static final String BD = "Banco";
   private static final String TABLE = "cuentas";
   private static final String URL = "jdbc:mysql://localhost:3306/";
   private Connection conexion;
   
   /**
    * Método para iniciar la conexión
    * @return estado: Estado de la conexión (Falsa o Verdadera).
    */
   public boolean conectar(){
       boolean estado = false;
       
       try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexion = DriverManager.getConnection(URL + BD, USER, PASSWORD);
            if(conexion != null){
                estado = true;
                System.out.println("Conexión exitosa!");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
       
       return estado;
   }
   
   /**
    * Método para finalizar la conexión
    */
   public void desconectar(){
       try{
           conexion.close();
           System.out.println("Desconectado");
       } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
       }
   }
   
   /**
    * Método para consultar la lista de cuentas de la base de datos
    * @return lista de cuentas
    */
   public ArrayList<Cuenta> consultarCuentas(){
       ArrayList<Cuenta> cuentas = new ArrayList<>();
       
       Statement st;
       try {
            st = conexion.createStatement();
            String query = "SELECT * FROM " + TABLE;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Cuenta c = new Cuenta();
                c.setNumCuenta(rs.getInt("numCuenta"));
                c.setNombre(rs.getString("nombre"));
                c.setSaldo(rs.getDouble("saldo"));
                c.setSucursal(rs.getString("sucursal"));
                cuentas.add(c);
            };
       } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
       }
       
       return cuentas;
   }
}
