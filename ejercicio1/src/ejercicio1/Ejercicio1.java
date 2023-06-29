/*
 ejercicio1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        int num = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        int suma = num + num2;
        System.out.println("La suma es: " + suma);    
    }
    
}
