package apuntes;

import java.util.ArrayList;
import java.util.Scanner;

public class metoods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Añade 4 números a la lista.");

        int contador = 0;
        while (contador < 4) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numeros.contains(numero)) {
                System.out.println("El número ya está en la lista. ¿Quieres añadirlo de todas formas? (s/n): ");
                char respuesta = scanner.next().charAt(0);

                if (respuesta == 's' || respuesta == 'S') {
                    numeros.add(numero);
                    contador++;
                    System.out.println("Número añadido.");
                } else {
                    System.out.println("Número no añadido.");
                }
            } else {
                numeros.add(numero);
                contador++;
                System.out.println("Número añadido.");
            }
        }

        System.out.println("Lista final: " + numeros);
    }
    }

