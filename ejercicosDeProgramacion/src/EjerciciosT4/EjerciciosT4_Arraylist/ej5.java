package EjerciciosT4.EjerciciosT4_Arraylist;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        // Crear un array para almacenar 8 números enteros
        int[] numeros = new int[8];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los 8 números
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números junto con "par" o "impar"
        System.out.println("\nResultado:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " es par");
            } else {
                System.out.println(numeros[i] + " es impar");
            }
        }

        // Cerrar el objeto Scanner

    }}