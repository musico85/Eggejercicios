/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nomb = leer.nextLine();
        
        System.out.println("Hola " + nomb + " bienvenido");
    }
    
}
