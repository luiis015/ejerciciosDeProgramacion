package EjerciciosT4;

import java.util.Scanner;

public class ejercico2Arrays {
    public static void main(String[] args) {
        System.out.println("Introduce la cantidad de posiciones que quieres");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        System.out.println("Su número de posiciones totales es " + cantidad);

        int[] arrays = new int[cantidad];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Introduce el número en la posición " + (i + 1) + ": ");
            arrays[i] = scanner.nextInt();
        }

        int mayor = arrays[0];
        int menor = arrays[0];


        for (int num : arrays) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);


    }
}