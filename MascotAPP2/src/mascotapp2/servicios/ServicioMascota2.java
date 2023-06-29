
package mascotapp2.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ServicioMascota2 {
    
    private Scanner leer = new Scanner(System.in);
    private List<String> mascotas;

    public ServicioMascota2() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas =  new ArrayList();
    }
    
    
    
    public void crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
        
    }
    
    public void mostrarMascotas(){
    
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (String var : mascotas) {
            System.out.println(var);
        }
        System.out.println("cantidad : " + mascotas.size());
    }
}
