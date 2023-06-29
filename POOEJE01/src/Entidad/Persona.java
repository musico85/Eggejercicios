package Entidad;

public class Persona {
    //atributos
    public String nombre;
    public String apellido;
    public int edad;
    private String comidafav;
    
    //metodos
    public Persona(){
    
    }
    
    public Persona(String nombre){
        
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, int edad, String comidafav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.comidafav = comidafav;
    }

    public String getComidafav() {
        return comidafav;
    }

    public void setComidafav(String comidafav) {
        this.comidafav = comidafav;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", comida favorita: " + comidafav + '}';
    }
    
}
