package PersonaSevicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean x = true;
        String sexo;
        System.out.print("Ingrese el nombre: ");
        String nombre = (leer.nextLine());
        System.out.print("Ingrese la edad: ");
        int edad = (leer.nextInt());
        System.out.print("");
        do {
            System.out.print("Ingrese el sexo M, F u O : ");
            sexo = (leer.next());
            if (sexo.equals("m") || (sexo.equals("f")) || (sexo.equals("o"))) {
                System.out.println("El valor ingresado es correcto");
                x = false;

            } else {
                System.out.println("El valor ingresado no es valido");
            }
        } while (x);

        System.out.print("Ingrese el peso: ");
        double peso = (leer.nextDouble());
        System.out.print("Ingrese la estatura");
        double altura = (leer.nextDouble());

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int IMC(Persona p00) {
        double imc = p00.peso / (p00.altura * p00.altura);
        if (imc < 20) {

            return -1;
        }

        if ((imc >= 20) && (imc <= 25)) {

            return 0;
        }
        if (imc > 20) {
        }
        return 1;
    }

    public int esMayorDeEdad(Persona p00) {
        if (p00.edad >= 18) {

            return 1;
        } else {
            return 0;
        }

    }

}
