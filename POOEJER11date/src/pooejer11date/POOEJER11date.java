/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooejer11date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class POOEJER11date {

    public static void main(String[] args) throws ParseException {

        Scanner leer = new Scanner(System.in);

        int anio = 0;
        int mes = 0;
        int dia = 0;

        int milisegundos = 86400000;

        Date fecha = new Date(dia, mes, anio);
        Date fechaActual = new Date();
        System.out.println("Fecha Actual");
        System.out.println(fechaActual);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha2 = sdf.format(fechaActual);
        System.out.println(fecha2);

        System.out.println("Ingrese la fecha: dd/MM/año");

        String fecha3 = leer.nextLine();

        Date fecha4 = sdf.parse(fecha3);
        fecha4 = new Date();

        int diferencia = ((fechaActual.getYear()- fecha4.getYear()));
        System.out.println(diferencia);

    }

}
