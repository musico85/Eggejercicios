/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 
5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = true;
        System.out.println("Ingrese el primer número");
        double num1 = leer.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2 = leer.nextDouble();
        
        do {
            System.out.println("----------------------------");
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("la Suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la Resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la Multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la división es: " + (num1 / num2));
                    break;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String sali = leer.next().toLowerCase();

                    if (sali.equals("n")) {
                        salir = true;

                    } else {
                        if (sali.equals("s")) {
                            salir = false;
                        }
                    }
                    break;

                default:
                    System.out.println("La opcion ingresada no es valida, elija una opción del menu: ");
            }
                
        } while (salir);
    }

}
