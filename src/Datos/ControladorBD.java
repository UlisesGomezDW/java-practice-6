/*
 * Esta clase tiene como objetivo proporcionar los métodos de conexión a la base de datos.
*/
package Datos;
 
import Modelo.Cuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA, GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
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
            String query = "SELECT * FROM " + TABLE + " ORDER BY saldo DESC";
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

    /**
    * Método para agregar una cuenta a la base de datos
    * @param cuenta: Cuenta a agregar
    * @return estado de si se agregó la cuenta
    */
    public boolean agregarCuenta(Cuenta cuenta) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "INSERT INTO " + TABLE + " VALUES (?, ?, ?, ?)";
        try {
            ps = conexion.prepareStatement(query);
            ps.setInt(1, cuenta.getNumCuenta()); 
            ps.setString(2, cuenta.getNombre());
            ps.setDouble(3, cuenta.getSaldo());
            ps.setString(4, cuenta.getSucursal());
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }

    /**
    * Método para eliminar una cuenta a la base de datos
    * @param numCuenta: Número de cuenta
    * @return estado de si se borró la cuenta
    */
    public boolean eliminarCuenta(int numCuenta) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "DELETE FROM " + TABLE + " WHERE numCuenta=?";
        try {
            ps = conexion.prepareStatement(query);
            ps.setInt(1, numCuenta);
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }

    /**
    * Método para actualizar una sucursal
    * @param numCuenta: Número de cuenta
    * @param sucursal: Sucursal
    * @return estado de si se actualizó la cuenta
    */
    public boolean actualizarSucursal(int numCuenta, String sucursal) {
        boolean estado = false;
        PreparedStatement ps; 
        String query = "UPDATE " + TABLE + " SET sucursal=? WHERE numCuenta=?";
        try {
            ps = conexion.prepareStatement(query);
            ps.setString(1, sucursal);
            ps.setInt(2, numCuenta);
            ps.execute();
            estado = true;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    
        return estado;
    }
}
