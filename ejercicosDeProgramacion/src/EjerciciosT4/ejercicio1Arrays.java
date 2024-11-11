package EjerciciosT4;

import java.util.Scanner;

public class ejercicio1Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número en la posición " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
            suma += numeros[i];
        }

        double media = (double) suma / numeros.length;


        System.out.println("La suma de todos los elementos es: " + suma);
        System.out.println("La media de todos los elementos es: " + media);

    }
}