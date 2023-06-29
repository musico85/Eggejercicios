package Entidades;

public class Rectangulo {

    private double base;
    private double altura;

    //constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //get y set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Superficie() {
        return base * altura;

    }

    public double Perimetro() {
        return (base * altura) * 2;
    }

    public void Dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }
       
    }
}
