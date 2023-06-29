/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia9colectioejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Guia9colectioejer1 {

   
    public static void main(String[] args) {
        
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        boolean continuar = true;
        
        do{
            System.out.println("Ingrese la raza del perro");
            String raza = leer.nextLine();
            String mascota = raza;
            razaPerros.add(mascota);
            System.out.println("¿Quieres seguir ingresando razas? (s/n)");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        } while(continuar);
        System.out.println("Raza de perros ingresados");
        for (String raza : razaPerros) {
            System.out.println(raza);
        }
        
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
        */
        
        //con iterador
        /*
        System.out.println("¿Que raza busca para eliminar?");
        String busqueda = leer.nextLine();
        Iterator<String>iterador = razaPerros.iterator();
        while (iterador.hasNext()) {
            if(iterador.next().equals(busqueda)){
            iterador.remove();
            }else{
                System.out.println("No se encuentra la raza de perro");
                break;
            }
            
        }
        System.out.println("Razas de perro que quedan");
        for (String raza : razaPerros) {
            System.out.println(raza);
            
        }*/
        
        
        System.out.println("¿Que raza busca para eliminar?");
        String busqueda = leer.nextLine();
        for (int i = 0; i < razaPerros.size(); i++) {
            if (razaPerros.get(i).equals(busqueda)) {
                razaPerros.remove(i);
                i--;
                System.out.println("Las razas de perros que quedan");
                for (String raza : razaPerros) {
                    System.out.println(raza);
                }
                break;
            }else{
                System.out.println("La raza de perro no se encuentra");
                break;
            }
            
        }
        
    }
    
}
