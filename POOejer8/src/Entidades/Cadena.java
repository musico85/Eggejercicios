/*
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidades;

import java.util.Scanner;

public class Cadena {

    public String frase;
    public int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                System.out.println(frase.charAt(i) + " ");
                cont++;
            }
        }
    }

    public void invertirFrase() {
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println(" ");

    }

    public void vecesRepetido() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter a buscar");
        char caracter = leer.next().charAt(0);
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == caracter) {
                cont++;
            }/*else{
                System.out.println("La frase no contiene ese caracter");
            }*/
        }
        System.out.println("La frase contiene el caracter: " + caracter + " veces " + cont + " repetidos");
    }

    public void compararLongitud() {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la frase para comparar longitud");
        String frase2 = leer.nextLine();
        int longitud2 = frase2.length();
        if (longitud == longitud2) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }

    }

    public void unirFrases() {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Ingrese la nueva frase para unir");
        String nuevafrase = leer.nextLine();
        System.out.println("");
        String total = frase + " " + nuevafrase;
        System.out.println(total);

    }

    public void reemplazar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter con que desea reemplazar las letras 'a'");
        char nuevocaract = leer.next().charAt(0);
        String reemplazo = frase.replace('a', nuevocaract);
        System.out.println(reemplazo);
    }

    public boolean contiene() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un caracter");
        char caracter = leer.next().charAt(0);
        int cont = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (frase.charAt(i) == caracter) {
                cont++;
            }
        }
        if (cont == 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

}
