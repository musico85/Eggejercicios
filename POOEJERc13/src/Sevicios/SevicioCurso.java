
package Sevicios;

import java.util.Scanner;


public class SevicioCurso {
    
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: " + (i+1) );
            String alumnos = leer.next();
            
            
        }
    
    }
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por día");
        double cantidadHorasPorDia = leer.nextDouble();
        System.out.println("Ingrese el turno: mañana o tarde");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = leer.nextDouble();
        
        
   
    }
    
}
