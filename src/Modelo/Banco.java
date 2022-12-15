/*
 * Esta clase tiene como objetivo ser la clase intermedia para los métodos.
*/

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author RANGEL PAREDES ANA SOFIA, GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
 * @version: 1.0
 */
public class Banco {
    private final static String AZC = "AZC";
    private final static String CUA = "CUA";
    private final static String XOC = "XOC";

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
    * Método para obtener una lista con las cuentas dependiendo de la surcursal
    * @return Lista de cuentas
    */
    private ArrayList<Cuenta> filtrarCuentas(String sucursal){
        ArrayList<Cuenta> lista = new ArrayList<>();
        for(Cuenta cuenta: this.getCuentas()){
            if(cuenta.getSucursal().equals(sucursal)) {
                lista.add(cuenta);
            }
       }
        return lista;
    }

    /**
    * Método para obtener el saldo total de una surcursal
    * @return saldo total
    */
    private double obtenerSueldoTotal(ArrayList<Cuenta> lista){
        double total = 0;
        for(Cuenta cuenta: lista){
            total += cuenta.getSaldo();
       }
        return total;
    }

    /**
    * Método para obtener el promedio del saldo total de una surcursal
    * @return promedio
    */
    private double obtenerPromedio(String sucursal){
        ArrayList<Cuenta> lista = filtrarCuentas(sucursal);
        double total = obtenerSueldoTotal(lista);

        return total / lista.size();
    }
    

    /**
    * Método para obtener el saldo promedio de cada sucursal.
    * @return mensaje con el saldo promedio de cada sucursal
    */
    public String obtenerSaldoPromedio() {
        return "AZC: " + this.obtenerPromedio(AZC) + "\nCUA: " + this.obtenerPromedio(CUA) + "\nXOC: " + this.obtenerPromedio(XOC);
    }

    /**
    * Método para obtener la sucursal con más cuentas.
    * @return sucursal con más cuentas
    */
    public String obtenerSucursalConMayorCuentas() {
        String sucursal = "";
        ArrayList<Cuenta> cuentasAzc = filtrarCuentas(AZC);
        ArrayList<Cuenta> cuentasCua = filtrarCuentas(CUA);
        ArrayList<Cuenta> cuentasXoc = filtrarCuentas(XOC);

        int max = Math.max(cuentasAzc.size(), Math.max(cuentasCua.size(), cuentasXoc.size()));
        
        if(max == cuentasAzc.size()) {
            sucursal = AZC;
        } else if(max == cuentasCua.size()){
            sucursal = CUA;
        } else if(max == cuentasXoc.size()){
            sucursal = XOC;
        } else {
            sucursal = "Todas";
        }
        return sucursal;
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
        Cuenta max = this.getCuentas().get(0);
        Cuenta min = this.getCuentas().get(this.getCuentas().size() - 1);

        return "Mayor Saldo: " + max.getNombre() + " (" + max.getSucursal() + ")\n" + "Menor Saldo: " + min.getNombre() + " (" + min.getSucursal() + ")";
    }
    

    @Override
    public String toString() {
        String message = "";
        for(Cuenta cuenta: this.getCuentas()){
            message += "\n" + cuenta;  
        }
        return message;
    }
}
