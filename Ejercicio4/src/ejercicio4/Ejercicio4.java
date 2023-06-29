/*
 ejercicio 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados centigrados");
        int centi = leer.nextInt();
        
        int fahren = 32 + (9 * centi/5);
        System.out.println("-----------------------------------------");
        System.out.println("La temperatura: " + centi + " en Fahrenheit es: " + fahren);
        
    }
    
}
