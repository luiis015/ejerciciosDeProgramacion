import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20]; // Array de 20 números
        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("a. Registrar posiciones");
            System.out.println("b. Obtener elementos de una posición");
            System.out.println("c. Mostrar el array completo");
            System.out.println("d. Mostrar el array ordenado (Burbuja)");
            System.out.println("e. Rotar el array");
            System.out.println("f. Salir");
            System.out.print("Elige una opción: ");
            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce un número para la posición " + i + ": ");
                        array[i] = scanner.nextInt();
                    }
                    break;

                case 'b':
                    System.out.print("Introduce la posición que deseas consultar (0 a 19): ");
                    int posicion = scanner.nextInt();
                    if (posicion >= 0 && posicion < 20) {
                        System.out.println("El número en la posición " + posicion + " es: " + array[posicion]);
                    } else {
                        System.out.println("Posición no válida.");
                    }
                    break;

                case 'c':
                    System.out.println("Array completo:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Posición " + i + ": " + array[i]);
                    }
                    break;
                case 'e':
                    System.out.println("Rotando el array hacia la derecha...");
                    int ultimo = array[array.length - 1];
                    for (int i = array.length - 1; i > 0; i--) {
                        array[i] = array[i - 1];
                    }

            }
        }
    }
}
