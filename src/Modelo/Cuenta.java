/*
 * Esta clase tiene como objetivo ser la plantilla para una cuenta.
*/
package Modelo;

/**
 *
 * @author GOMEZ GOMEZ BRYAN ULISES, BENITEZ RIOS CARLOS EDUARDO.
 * @version: 1.0
 */
public class Cuenta {
    private int numCuenta;
    private String nombre;
    private double saldo;
    private String sucursal;
    
    /**
    * Constructor por defecto de la clase
    */
    public Cuenta(){}

    /**
    * Constructor paramétrizado de la clase
    * @param numCuenta: inicializa el valor de numCuenta
    * @param nombre: inicializa el valor de nombre
    * @param saldo: inicializa el valor de saldo
    * @param sucursal: inicializa el valor de sucursal
    */
    public Cuenta(int numCuenta, String nombre, double saldo, String sucursal) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.sucursal = sucursal;
    }

    /**
    * Método de acceso(setter) del atributo numCuenta
    * @param numCuenta: establece el valor de numCuenta
    */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
    * Método de acceso(setter) del atributo nombre
    * @param nombre: establece el valor de nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Método de acceso(setter) del atributo saldo
    * @param saldo: establece el valor de saldo
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
    * Método de acceso(setter) del atributo sucursal
    * @param sucursal: establece el valor de sucursal
    */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
    * Método de acceso(getter) del atributo numCuenta
    * @return numCuenta
    */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
    * Método de acceso(getter) del atributo nombre
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Método de acceso(getter) del atributo saldo
    * @return saldo
    */
    public double getSaldo() {
        return saldo;
    }

    /**
    * Método de acceso(getter) del atributo sucursal
    * @return sucursal
    */
    public String getSucursal() {
        return sucursal;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", nombre=" + nombre + ", saldo=" + saldo + ", sucursal=" + sucursal + '}';
    }
    
}
