package Entidad;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*radio;
    }
    public double perimetro(){
        return 2 * Math.PI *radio;
    }
}
