import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántos datos deseas guardar? ");
            int cantidad = scanner.nextInt();
            int[] lista = new int[cantidad];




            System.out.println("Rellenando la lista con números aleatorios...");
            for (int i = 0; i < cantidad; i++) {
                lista[i] = (int) (Math.random() * 21);
            }
            System.out.print("Lista generada: ");
            for (int num : lista) {
                System.out.print(num + " ");
            }
            System.out.println();
            int maximo = lista[0];
            int minimo = lista[0];
            for (int num : lista) {
                if (num > maximo) {
                    maximo = num;
                }
                if (num < minimo) {
                    minimo = num;
                }

            }
            System.out.println("El número más grande es: " + maximo);
            System.out.println("El número más pequeño es: " + minimo);
            int pares = 0;
            int impares = 0;
            for (int num : lista) {
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("** Mostrar par/impar");
            System.out.println("Cantidad de números pares: " + pares);
            System.out.println("Cantidad de números impares: " + impares);
            System.out.println("** Mostrar repeticiones");
            System.out.print("Introduce un número para ver cuántas veces aparece en la lista: ");
            int numeroBuscado = scanner.nextInt();
            int repeticiones = 0;
            for (int num : lista) {
                if (num == numeroBuscado) {
                    repeticiones++;
                }
            }
            System.out.println("El número " + numeroBuscado + " aparece " + repeticiones + " veces en la lista.");

        }
    }

