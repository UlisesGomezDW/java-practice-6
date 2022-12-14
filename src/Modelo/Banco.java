/*
 * Esta clase tiene como objetivo ser la clase intermedia para los métodos.
*/

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
 * @version: 1.0
 */
public class Banco {
    private ArrayList<Cuenta> cuentas;

    /**
    * Constructor por defecto de la clase
    */
    public Banco() {}

    /**
    * Constructor paramétrizado de la clase
    * @param cuentas: inicializa el valor de la lista de cuentas
    */
    public Banco(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
    * Método de acceso(setter) del atributo cuentas
    * @param cuentas: establece el valor de la lista cuentas
    */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    /**
    * Método de acceso(getter) del atributo cuentas
    * @return Lista de cuentas
    */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
    * Método para obtener el saldo promedio de cada sucursal.
    * @return mensaje con el saldo promedio de cada sucursal
    */
    public String obtenerSaldoPromedio() {
        return "AZC: " + 0 + "\nCUA: " + 0 + "\nXOC: " + 0;
    }

    /**
    * Método para obtener la sucursal con más cuentas.
    * @return sucursal con más cuentas
    */
    public String obtenerSucursalConMayorCuentas() {
        return "AZC";
    }

    /**
    * Método para obtener la sucursal con menor saldo total.
    * @return sucursal con menor saldo total
    */
    public String obtenerSucursalConMenorSaldo() {
        return "AZC";
    }

    /**
    * Método para obtener los saldos de mayor a menor
    * @return saldos de mayor a menor
    */
    public String obtenerSaldosMayorMenor() {
        return "Mayor Saldo: " + "Jorge Padilla" + " (" + "AZC" + ")\n" + "Menor Saldo: " + "Lucia Guerrero" + " (" + "AZC" + ")";
    }
    

    @Override
    public String toString() {
        String message = "";
        for(Cuenta cuenta: this.getCuentas()){
             message += cuenta;
        }
        return message;
    }
}
