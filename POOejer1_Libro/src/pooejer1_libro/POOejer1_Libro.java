/*
 * Ejercicio 01...Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooejer1_libro;

import Entidad.Libro;
import java.util.Scanner;

public class POOejer1_Libro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN, Titulo, Autor, número de páginas");
        Libro libroUno = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        System.out.println("ISBN: " + libroUno.ISBN + "Titulo: " + libroUno.Titulo + "Autor: " + libroUno.Autor + "Número de Páginas: " + libroUno.NumeroPaginas);
    }

}
