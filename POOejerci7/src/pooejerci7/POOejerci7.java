package pooejerci7;

import Entidades.Persona;
import PersonaSevicio.PersonaServicio;

public class POOejerci7 {

    public static void main(String[] args) {
        PersonaServicio sm = new PersonaServicio();

        System.out.println("--------------------------------");
        
         Persona p01 = sm.crearPersona();
         System.out.println("--------------------------------"); Persona p02 =
         sm.crearPersona();
         System.out.println("--------------------------------"); Persona p03 =
         sm.crearPersona();
         System.out.println("--------------------------------"); Persona p04 =
         sm.crearPersona();
         
        //Persona p01 = new Persona("Albert", 38, "m", 67, 1.72);
        //Persona p02 = new Persona("Emma", 68, "f", 57, 1.55);
        //Persona p03 = new Persona("Alfredo", 68, "m", 73, 1.70);
        //Persona p04 = new Persona("Martha", 42, "f", 67, 1.65);
        System.out.println("--------------------------------");
        System.out.println("Resumen: ");
        System.out.println(p01.toString());
        if (sm.IMC(p01) == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        }
        if (sm.IMC(p01) == 0) {
            System.out.println("Esta en su peso ideal");
        }
        if (sm.IMC(p01) == 1) {
            System.out.println("Esta sobre su peso ideal");
        }

        if (sm.esMayorDeEdad(p01) == 1) {
            System.out.println("Es mayor de edad");
        }
        if (sm.esMayorDeEdad(p01) == 0) {
            System.out.println("Es menor de edad");
        }
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Resumen: ");
        System.out.println(p02.toString());
        if (sm.IMC(p02) == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        }
        if (sm.IMC(p02) == 0) {
            System.out.println("Esta en su peso ideal");
        }
        if (sm.IMC(p02) == 1) {
            System.out.println("Esta sobre su peso ideal");
        }

        if (sm.esMayorDeEdad(p02) == 1) {
            System.out.println("Es mayor de edad");
        }
        if (sm.esMayorDeEdad(p02) == 0) {
            System.out.println("Es menor de edad");
        }
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Resumen: ");
        System.out.println(p03.toString());
        if (sm.IMC(p03) == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        }
        if (sm.IMC(p03) == 0) {
            System.out.println("Esta en su peso ideal");
        }
        if (sm.IMC(p03) == 1) {
            System.out.println("Esta sobre su peso ideal");
        }

        if (sm.esMayorDeEdad(p03) == 1) {
            System.out.println("Es mayor de edad");
        }
        if (sm.esMayorDeEdad(p03) == 0) {
            System.out.println("Es menor de edad");
        }
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Resumen: ");
        System.out.println(p04.toString());
        if (sm.IMC(p04) == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        }
        if (sm.IMC(p04) == 0) {
            System.out.println("Esta en su peso ideal");
        }
        if (sm.IMC(p04) == 1) {
            System.out.println("Esta sobre su peso ideal");
        }

        if (sm.esMayorDeEdad(p04) == 1) {
            System.out.println("Es mayor de edad");
        }
        if (sm.esMayorDeEdad(p04) == 0) {
            System.out.println("Es menor de edad");
        }
        System.out.println("--------------------------------");

        int imc1 = sm.IMC(p01);
        int imc2 = sm.IMC(p02);
        int imc3 = sm.IMC(p03);
        int imc4 = sm.IMC(p04);

        int edad1 = sm.esMayorDeEdad(p01);
        int edad2 = sm.esMayorDeEdad(p02);
        int edad3 = sm.esMayorDeEdad(p03);
        int edad4 = sm.esMayorDeEdad(p04);

        int personasPorDebajoPeso = 0;
        int personasPesoIdeal = 0;
        int personasPorEncimaPeso = 0;

        if (imc1 == -1) {
            personasPorDebajoPeso++;
        } else if (imc1 == 0) {
            personasPesoIdeal++;
        } else {
            personasPorEncimaPeso++;
        }

        if (imc2 == -1) {
            personasPorDebajoPeso++;
        } else if (imc2 == 0) {
            personasPesoIdeal++;
        } else {
            personasPorEncimaPeso++;
        }

        if (imc3 == -1) {
            personasPorDebajoPeso++;
        } else if (imc3 == 0) {
            personasPesoIdeal++;
        } else {
            personasPorEncimaPeso++;
        }

        if (imc4 == -1) {
            personasPorDebajoPeso++;
        } else if (imc4 == 0) {
            personasPesoIdeal++;
        } else {
            personasPorEncimaPeso++;
        }

        int totalPersonas = 4;

        double porcentajePorDebajoPeso = (personasPorDebajoPeso * 100.0) / totalPersonas;
        double porcentajePesoIdeal = (personasPesoIdeal * 100.0) / totalPersonas;
        double porcentajePorEncimaPeso = (personasPorEncimaPeso * 100.0) / totalPersonas;

        int personasMayoresEdad = 0;
        int personasMenoresEdad = 0;

        if (edad1 == 1) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }
        if (edad2 == 1) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }
        if (edad3 == 1) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }
        if (edad4 == 1) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }

        double porcentajeMayoresEdad = (personasPorDebajoPeso * 100.0) / totalPersonas;
        double porcentajeMenoresEdad = (personasPesoIdeal * 100.0) / totalPersonas;

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Porcentaje de personas con sobre peso: " + porcentajePorEncimaPeso);
        System.out.println("Porcentaje de personas con  peso ideal: " + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas debajo del peso ideal : " + porcentajePorDebajoPeso);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad);
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad);
        System.out.println("-----------------------------------------------------------------");
    }

}
