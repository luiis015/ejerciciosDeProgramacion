package EjerciciosT4PracExamen;

import java.util.Scanner;

public class ej2 {


    static final int NUM_MESAS = 10;
    static String[] mesas = new String[NUM_MESAS];
    static double[] precios = new double[NUM_MESAS];
    static String[][] consumiciones = new String[NUM_MESAS][10];
    static int[] consumicionesCount = new int[NUM_MESAS];
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n--- Gestión de Mesas del Restaurante ---");
            System.out.println("1. Asignar mesa");
            System.out.println("2. Liberar mesa");
            System.out.println("3. Realizar pedido");
            System.out.println("4. Mostrar asignaciones actuales");
            System.out.println("5. Mostrar mesas ordenadas por precio");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();




            if (opcion == 1) {
                asignarMesa(scanner);
            } else if (opcion == 2) {
                liberarMesa(scanner);
            } else if (opcion == 3) {
                realizarPedido(scanner);
            } else if (opcion == 4) {
                mostrarAsignaciones();
            } else if (opcion == 5) {

            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida, intenta otra vez.");
            }
        }
    }





    static void asignarMesa(Scanner scanner) {
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < NUM_MESAS; i++) {
            if (mesas[i] == null) {
                mesas[i] = nombre;
                System.out.println("Mesa " + (i + 1) + " asignada a " + nombre);
                return;
            }
        }
        System.out.println("No hay mesas disponibles.");
    }






    static void liberarMesa(Scanner scanner) {
        System.out.print("Número de mesa a liberar: ");
        int numMesa = scanner.nextInt();

        if (numMesa < 1 || numMesa > NUM_MESAS) {
            System.out.println("Número de mesa inválido.");
        } else if (mesas[numMesa - 1] == null) {
            System.out.println("La mesa ya está libre.");
        } else {
            System.out.println("Liberando la mesa " + numMesa + " del cliente " + mesas[numMesa - 1]);
            System.out.println("Consumiciones:");

            for (int i = 0; i < consumicionesCount[numMesa - 1]; i++) {
                System.out.println("- " + consumiciones[numMesa - 1][i]);
            }
            System.out.println("Precio total: " + precios[numMesa - 1] + "€");

            mesas[numMesa - 1] = null;
            precios[numMesa - 1] = 0.0;
            consumicionesCount[numMesa - 1] = 0;

            System.out.println("Mesa liberada.");
        }
    }




    static void realizarPedido(Scanner scanner) {
        System.out.print("Número de mesa: ");
        int numMesa = scanner.nextInt();
        if (numMesa < 1 || numMesa > NUM_MESAS) {
            System.out.println("Número de mesa inválido.");
        } else if (mesas[numMesa - 1] == null) {
            System.out.println("La mesa no está ocupada.");
        } else {
            System.out.print("Producto: ");
            String producto = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            if (consumicionesCount[numMesa - 1] < 10) {
                consumiciones[numMesa - 1][consumicionesCount[numMesa - 1]] = producto;
                consumicionesCount[numMesa - 1]++;
                precios[numMesa - 1] += precio;

                System.out.println("Pedido añadido a la mesa " + numMesa);
            } else {
                System.out.println("No se pueden añadir más pedidos a esta mesa.");
            }
        }
    }








    static void mostrarAsignaciones() {
        System.out.println("\n--- Mesas Ocupadas ---");

        for (int i = 0; i < NUM_MESAS; i++) {
            if (mesas[i] != null) {
                System.out.println("Mesa " + (i + 1) + " - Cliente: " + mesas[i]);
                System.out.print("Consumiciones: ");
                for (int j = 0; j < consumicionesCount[i]; j++) {
                    System.out.print(consumiciones[i][j] + " ");
                }
                System.out.println("\nTotal: " + precios[i] + "€");
            }
        }
    }






        }





