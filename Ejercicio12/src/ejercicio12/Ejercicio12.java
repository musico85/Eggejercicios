/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       //boolean salir = true;
        
        String cadena;
        int cantidad;
        
        
        do {

            System.out.println("Ingrese la cadena");
            cadena = leer.next();

            cantidad = cadena.length();
            
            if (cantidad != 5) {

                System.out.println("Error! el tamaño de la cadena debe ser de 5");
            }

        } while (cantidad != 5);

        do {
            
            String aux = cadena.substring(0, 1);
            String aux2 = cadena.substring(0, 4);
                    
                if(){
                
                }
        } while (cadena.equals("&&&&&"));

    }
}
