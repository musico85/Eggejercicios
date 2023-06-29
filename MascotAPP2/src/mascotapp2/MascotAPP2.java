
package mascotapp2;

import mascotapp2.servicios.ServicioMascota2;

public class MascotAPP2 {

    
    public static void main(String[] args) {
        
        ServicioMascota2 servMasc = new ServicioMascota2();
        
        servMasc.crearMascota();
        servMasc.crearMascota();
        
        servMasc.mostrarMascotas();
        
    }
    
}
