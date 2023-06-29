/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio6;

import java.util.Scanner;
        
public class Ejercicio6 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un número a evaluar");
        int num = leer.nextInt();
        
        if(num%2 == 0){
            System.out.println("El número: " + num + " es par");
        }else{
            System.out.println("El npumero: " + num + " es impar");
        }
    }
    
}