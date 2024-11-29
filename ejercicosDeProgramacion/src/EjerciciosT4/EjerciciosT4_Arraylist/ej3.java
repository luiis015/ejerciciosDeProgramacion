package EjerciciosT4.EjerciciosT4_Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ej3 {
    public static void main(String[] args) {
        ArrayList <Integer> lista1 = new ArrayList<>();
        ArrayList <Integer> lista2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
        lista1.add(random.nextInt(100) + (1) );
            lista2.add(random.nextInt(100) + (1) );

        }
// Variable para contar cuántos números son iguales en la misma posición
        int iguales = 0;

        // Comprobar cuántos números son iguales en la misma posición en ambos ArrayLists
        for (int i = 0; i < 20; i++) {
            if (lista1.get(i).equals(lista2.get(i))) {
                iguales++;  // Si el número en la misma posición es igual, aumentamos el contador
            }
        }

        // Imprimir el resultado
        System.out.println("Cantidad de números iguales en la misma posición: " + iguales);
    }







    }

