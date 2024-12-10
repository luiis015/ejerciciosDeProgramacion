package EjercicosClase;

import java.util.Scanner;

public class ej2 {
    // Array para almacenar contactos
    static String[] dnis = new String[10];
    static String[] nombres = new String[10];
    static int totalContactos = 0;

    // Agregar contacto
    public static boolean agregarContacto(String nombre, String dni) {
        // Verificar si el DNI ya existe
        for (int i = 0; i < totalContactos; i++) {
            if (dnis[i].equals(dni)) {
                return false; // El DNI ya existe
            }
        }

        // Agregar contacto sin verificar espacio
        nombres[totalContactos] = nombre;
        dnis[totalContactos] = dni;
        totalContactos++;
        return true;
    }










    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("===== Servidor de Contactos =====");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.nextLine();

                    boolean exito = agregarContacto(nombre, dni);
                    if (exito) {
                        System.out.println("Contacto agregado con éxito.");
                    } else {
                        System.out.println("Error: el contacto no se pudo agregar (DNI duplicado).");
                    }
                    break;

                case 2:
                    System.out.println("===== Lista de Contactos =====");
                    for (int i = 0; i < totalContactos; i++) {
                        System.out.println((i + 1) + ". Nombre: " + nombres[i] + ", DNI: " + dnis[i]);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del servidor de contactos...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }

    }
}