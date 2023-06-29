
package pooejer4rectangulo;

import Entidades.Rectangulo;
import java.util.Scanner;

public class POOejer4rectangulo {

 
    public static void main(String[] args) {
        
        Rectangulo rect = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo");
        rect.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        rect.setAltura(leer.nextDouble());
        
        System.out.println("La superficie es: " + rect.Superficie());
        System.out.println("El perimetro es: " + rect.Perimetro() );
        System.out.println("El dibujo es : ");
        rect.Dibujar();
    }
    
}
