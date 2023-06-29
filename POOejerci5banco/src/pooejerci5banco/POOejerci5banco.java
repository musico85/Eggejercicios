/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package pooejerci5banco;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class POOejerci5banco {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
        byte opcion = 0;

        do {
            System.out.println("El banco Triple A, le da la bienvenida");
            System.out.println("Elija una opción del menú");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Realizar deposito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Realizar retiro rápido");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar información de la cuenta");
            System.out.println("7. Salir");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número de la cuenta");
                    cuenta.setNumeroCuenta(leer.nextInt());
                    System.out.println("Ingrese el DNI");
                    cuenta.setDni(leer.nextLong());
                    System.out.println("Ingrese el saldo actual de la cuenta" + cuenta.getNumeroCuenta() + ":");
                    cuenta.setSaldoActual(leer.nextInt());
                    break;
                case 2:

                    System.out.println("Ingrese el monto que desea depositar: ");
                    cuenta.setDeposito(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + cuenta.deposito());
                    cuenta.setSaldoActual((int) cuenta.deposito());

                    break;

                case 3:

                    System.out.println("Ingrese el monto que desea retirar: ");
                    cuenta.setRetiro(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + cuenta.retiro());
                    cuenta.setSaldoActual((int) cuenta.retiro());

                    break;

                case 4:

                    System.out.println("Usted selecciono retiro rapido ");
                    System.out.println("El monto correspondiente al 20% es: " + cuenta.retiroRapido());
                    cuenta.setSaldoActual((int) cuenta.retiroRapido());

                    break;

                case 5:

                    System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());

                    break;

                case 6:

                    System.out.println("Resumen de la cuenta: ");
                    System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
                    System.out.println("Numero de DNI: " + cuenta.getDni());
                    System.out.println("Saldo actual: " + cuenta.getSaldoActual());

                    break;
            }
        } while (opcion != 7);
    }

}


    

