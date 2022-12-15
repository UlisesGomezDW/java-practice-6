/*
 * Clase principal para ver resultados.
 */
package Vista;

import Datos.ControladorBD;
import Modelo.Banco;
import Modelo.Cuenta;
import java.util.ArrayList;

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
        ControladorBD control = new ControladorBD();
        ArrayList<Cuenta> cuentas;
        System.out.println(control.conectar());
        
        cuentas = control.consultarCuentas();

        /* 
            See all fields of db
            System.out.println(banco.toString());
        */

        Banco banco = new Banco(cuentas);
        System.out.println("\nSaldo promedio de todas las cuentas por cada sucursal: AZC, CUA, XOC.");
        System.out.println(banco.obtenerSaldoPromedio());

        System.out.println("\n¿Cuál es la sucursal con mayor número de cuentas abiertas?");
        System.out.println(banco.obtenerSucursalConMayorCuentas());

        System.out.println("\n¿Cuál es la sucursal con menor saldo total de sus cuentas?");
        System.out.println(banco.obtenerSucursalConMenorSaldo());

        System.out.println("\n¿Cuál es el nombre del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal?");
        System.out.println(banco.obtenerSaldosMayorMenor());
        
    }
    
}
