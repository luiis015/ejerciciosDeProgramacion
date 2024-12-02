package EjerciciosT4.EjerciciosT4_Arraylist;

import java.util.Random;

public class ej4 {
    public static void main(String[] args) {
        // Definir los arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Llenar el array numero con valores aleatorios entre 0 y 100
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(101);  // Genera un número entre 0 y 100
        }

        // Calcular los valores del array cuadrado y cubo
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i]; // Cuadrado del número
            cubo[i] = numero[i] * numero[i] * numero[i]; // Cubo del número
        }

        // Mostrar los resultados
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}