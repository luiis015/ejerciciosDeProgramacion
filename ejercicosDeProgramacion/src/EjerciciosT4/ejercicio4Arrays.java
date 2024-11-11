package EjerciciosT4;

import java.util.Scanner;

public class ejercicio4Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        int[] numeros = new int[longitud];

        // Llenar el array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número en la posición " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mover todos los elementos a la derecha
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        System.out.println("Array después de mover a la derecha: " + java.util.Arrays.toString(numeros));

        // Mover todos los elementos a la izquierda
        int primero = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = primero;
        System.out.println("Array después de mover a la izquierda: " + java.util.Arrays.toString(numeros));


    }
}

