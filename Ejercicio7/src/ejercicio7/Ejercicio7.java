/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

  
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        String pal = "eureka";
        
        System.out.println("Ingrese una palabra");
        String pal2 = leer.nextLine();
        
        if(pal.equals(pal2)){
            System.out.println("¡¡CORRECTO!!");
    
        }else{
            System.out.println("INCORRECTO :(");
        }
                
                
    }
    
}
