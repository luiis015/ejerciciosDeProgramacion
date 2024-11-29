package EjerciciosT4;

import java.util.Random;

public class ArrayAleatorio {
    public static void main(String[] args) {
        Random rand = new Random();

        // Crear un array de 5 filas, con columnas aleatorias entre 2 y 6
        int[][] numeros = new int[5][];
        for (int i = 0; i < numeros.length; i++) {
            // Asignar un número aleatorio de columnas entre 2 y 6 para cada fila
            int columnas = rand.nextInt(5) + 2; // genera un número entre 2 y 6
            numeros[i] = new int[columnas];
        }

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = rand.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }

        // Imprimir el array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


//

