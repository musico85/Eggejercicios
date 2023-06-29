//POO ejercicio 6
package ejer_6_nespresso;

import Entidades.Cafetera;
import java.util.Scanner;

public class Ejer_6_Nespresso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cafetera taza = new Cafetera(1000, 500);

        byte opcion = 0;

        do {
            System.out.println("Elija una opción del menú");
            System.out.println("1. Ingrese el tamaño de su taza");
            System.out.println("2. llenar cafetera");
            System.out.println("3. servir taza");
            System.out.println("4. vaciar");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:

                    System.out.println("1. Ingresa el tamaño de su taza");
                    taza.servirTaza(leer.nextInt());
                    System.out.println("cantidad actual de café: " + taza.getCapacidadActual());
                    continue;
                case 2:
                    System.out.println("2. Llenar cafetera");
                    taza.llenarCafetera();
                    break;
                case 3:
                    System.out.println("3. Servir taza");
                    //taza.servirTaza();
                    break;
                case 4:
                    System.out.println("vaciar cafetera");
                    taza.vaciarCafetera(opcion);
                    break;
            }
        } while (true);

    }

}
