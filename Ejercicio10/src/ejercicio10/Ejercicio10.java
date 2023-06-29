/*
 *Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el limite inicial.
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor límite");
        int num = leer.nextInt();
        int suma = 0;
        while(num <= 0){
            
          System.out.println("Error!, el número no puede ser negativo");
            System.out.println("Ingrese el valor del límite");
            num = leer.nextInt();   
        }
            System.out.println("Ingrese los números a sumar");
            int val = leer.nextInt();
            
            while(val > num){
                System.out.println("El valor ingresado es mayor que el límite: " + num);
                break;
            }
            suma = suma + val;
            while(suma < num){
                System.out.println("Ingrese los números a sumar");
                val = leer.nextInt();
                suma = suma + val;
             
            }
            System.out.println("La suma de los números es: " + suma);
    }   
}