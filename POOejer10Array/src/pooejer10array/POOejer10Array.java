package pooejer10array;

import java.util.Arrays;

public class POOejer10Array {

    public static void main(String[] args) {
        double[] numA = new double[50];
        double[] numB = new double[20];

        for (int i = 0; i < numA.length; i++) {
            numA[i] = Math.round(Math.random() * 10);

        }
        for (int i = 0; i < numA.length; i++) {
            System.out.print(numA[i] + " ");
        }
        Arrays.sort(numA);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Vector ordenado");
        for (int i = 0; i < numA.length; i++) {
            System.out.print(numA[i] + 2);
        }
        for (int i = 0; i < 10; i++) {
            numB[i]=numA[i];
        }
        System.out.println(" ");
        Arrays.fill(numB, 10, 20, 0.5);
        for (int i = 0; i < numB.length; i++) {
            System.out.print(numB[i] + " ");
        }
        Arrays.toString(numB);
    }
}
