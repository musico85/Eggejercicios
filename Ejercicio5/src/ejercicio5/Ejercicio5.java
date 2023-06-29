/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        int dob = num * num;
        int trip = num * num * num;
        double raizcua = Math.sqrt(num);
        
        System.out.println("El doble del número es: " + dob);
        System.out.println("El triple del número es " + trip);
        System.out.println("la raíz cuadrada del número es : " + raizcua); 
     
       
    }
    
}
