/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pooejer9;

import Entidades.Matematica;

public class POOejer9 {

    public static void main(String[] args) {
        Matematica oper = new Matematica();
        
        date

        oper.setNum1(Math.round(Math.random() * 10));
        oper.setNum2(Math.round(Math.random() * 10));
        System.out.println(oper.toString());
        System.out.println("El número mayor es: " + oper.devolverMayor());
        System.out.println("El número menor es: " + oper.devolverMenor());
        System.out.println("La potencia es:" + oper.calcularPotencia());
        System.out.println("La raíz cuadrada es: " + oper.calcularlaRaiz());

    }

}
