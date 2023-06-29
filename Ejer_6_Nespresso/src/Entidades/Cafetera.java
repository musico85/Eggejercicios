package Entidades;

public class Cafetera {

    public int tamañoDeTaza;
    public int capacidadMaxima;
    public int capacidadActual;

    public Cafetera(int tamañoDeTaza) {
        this.tamañoDeTaza = tamañoDeTaza;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public Cafetera() {
    }

    public int getTamañoDeTaza() {
        return tamañoDeTaza;
    }

    public void setTamañoDeTaza(int tamañoDeTaza) {
        this.tamañoDeTaza = tamañoDeTaza;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int llenarCafetera() {
        return capacidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamañoDeTaza) {

        if (capacidadActual >= tamañoDeTaza) {
          capacidadActual = capacidadActual - tamañoDeTaza;
            System.out.println("Se ha llenado la taza");
        } else {
            System.out.println("No se llenó la taza, la cafetera quedó con:");
            //capacidadActual = 0;
        }

    }

    public int vaciarCafetera(int capacidadActual) {
        return capacidadActual = 0;
    }

    public int agregarCafe(int CapacidadActual) {
        return this.capacidadActual + this.capacidadActual;
    }
}
