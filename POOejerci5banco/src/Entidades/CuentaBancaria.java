
package Entidades;


public class CuentaBancaria {
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private int deposito;
    private int retiro;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual, int deposito, int retiro) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.deposito = deposito;
        this.retiro = retiro;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

   //metodos
    
    public double retiro(){
        return saldoActual - retiro;
    }
    
    public double deposito(){
        return saldoActual + deposito;
    }
    
    public double retiroRapido(){
        return saldoActual -(saldoActual*0.2);
    }
}
