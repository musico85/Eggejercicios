
public class Jaguar {
    
    private int edad;
    private float peso;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
   public String toString(){
    return "mi edad es " + this.getEdad() + "mi peso es: " + this.getPeso() ;
    }
    
}
