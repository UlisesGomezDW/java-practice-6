/*
 * Clase principal para ver resultados.
 */
package Vista;

import Datos.ControladorBD;
import Modelo.Banco;
import Modelo.Cuenta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA, GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
 * @version: 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ControladorBD control = new ControladorBD();
        
        control.conectar();

        String eleccion = "s";
        do {
            System.out.println("Elige una opción\n1. Ver resultados\n2. Agregar cuenta\n3. Actualizar cuenta\n4. Eliminar cuenta");
            int paso = sc.nextInt();
            switch(paso){
                case 1:
                    ArrayList<Cuenta> cuentas;
                    cuentas = control.consultarCuentas();
                    Banco banco = new Banco(cuentas);
                    System.out.println("_");
                    System.out.println("\nSaldo promedio de todas las cuentas por cada sucursal: AZC, CUA, XOC.");
                    System.out.println(banco.obtenerSaldoPromedio());
            
                    System.out.println("\n¿Cuál es la sucursal con mayor número de cuentas abiertas?");
                    System.out.println(banco.obtenerSucursalConMayorCuentas());
            
                    System.out.println("\n¿Cuál es la sucursal con menor saldo total de sus cuentas?");
                    System.out.println(banco.obtenerSucursalConMenorSaldo());
            
                    System.out.println("\n¿Cuál es el nombre del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal?");
                    System.out.println(banco.obtenerSaldosMayorMenor());
                    System.out.println("_");
                break;
                case 2:
                    String nombre = "";
                    System.out.println("Número de cuenta:");
                    int numCuenta = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nombre del cuentahabiente:");
                    nombre += sc.nextLine();
                    System.out.println("Saldo:");
                    double saldo = sc.nextDouble();
                    System.out.println("Sucursal:");
                    String sucursal = sc.next();
                    Cuenta c = new Cuenta( numCuenta, nombre, saldo, sucursal);
                    boolean estado = control.agregarCuenta(c);
                    if(estado){
                        System.out.println("Cuenta agregada");
                    } else {
                        System.out.println("No se agregó la cuenta");
                    }
                break;
                case 3:
                    System.out.println("Número de cuenta:");
                    int numAc = sc.nextInt();
                    System.out.println("Sucursal:");
                    String sucursalAc = sc.next();
                    boolean estadoAc = control.actualizarSucursal(numAc, sucursalAc);
                    if(estadoAc){
                        System.out.println("Cuenta actualizada");
                    } else {
                        System.out.println("No se actualizó la cuenta");
                    }
                break;
                case 4:
                    System.out.println("Número de cuenta:");
                    int numD = sc.nextInt();
                    boolean estadoD = control.eliminarCuenta(numD);
                    if(estadoD){
                        System.out.println("Cuenta borrada");
                    } else {
                        System.out.println("No se borró la cuenta");
                    }
                break;
                default:
                    System.out.println("Elije una opción en el menú");
                break;
            }
            System.out.println("¿Deseas continuar (s/n)?");
            eleccion = sc.next();
        } while(eleccion.equals("s"));
        sc.close();
        control.desconectar();
    }
}
