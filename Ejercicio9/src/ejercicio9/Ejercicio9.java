/*
Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Substring y equals() de Java.
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");
        String pal = leer.nextLine();

        String aux = pal.substring(0, 1);

        String aux2 = aux.toUpperCase();

        String aux3 = "A";

        if (aux2.equals(aux3)) {
            System.out.println("CORRETO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
