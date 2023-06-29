/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        
        String frase2 = frase.toUpperCase();
        System.out.println(frase2);
        
        String frase3 = frase.toLowerCase();
        System.out.println(frase3);
        
       
    }
    
}
