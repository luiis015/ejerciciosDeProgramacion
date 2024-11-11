package EjerciciosT4;

import java.util.Scanner;

public class ejercicio6Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        // Validar el número máximo a guardar en el array
        int numeroMaximo;
        do {
            System.out.print("Introduce el número máximo que deseas guardar en el array: ");
            numeroMaximo = scanner.nextInt();

            if (numeroMaximo < longitud) {
                System.out.println("El número máximo debe ser igual o mayor que la longitud del array. Inténtalo de nuevo.");
            }
        } while (numeroMaximo < longitud);

        System.out.println("Longitud del array: " + longitud);
        System.out.println("Número máximo aceptado: " + numeroMaximo);

    }
}

