
package pooeje01;



import Entidad.Persona;
import java.util.Scanner;


public class POOEJE01 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Instanciación utilizando el constructor vacío
        Persona PrimeraPersona = new Persona("Albert", "Arrieta", 18, "arroz");
        
        
        //Instanciación utilizando el constructor por parámetro
        Persona segundaPersona = new Persona("Albert");
        System.out.println("Ingrese su comida favorita");
          
        PrimeraPersona.setComidafav(leer.next());
        
        
        System.out.println(PrimeraPersona);
        
    }
    
}
