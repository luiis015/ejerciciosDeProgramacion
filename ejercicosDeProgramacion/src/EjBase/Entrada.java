package EjBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar hasta 5 personas
        Persona[] personas = new Persona[5];
        int contadorPersonas = 0; // Llevar un conteo de cuántas personas se han añadido

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir una persona");
            System.out.println("2. Mostrar todas las personas");
            System.out.println("3. Buscar una persona por nombre");
            System.out.println("4. Eliminar una persona por nombre");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1: // Añadir una persona
                    if (contadorPersonas < personas.length) {
                        System.out.println("Introduce los datos de la persona:");
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("DNI: ");
                        String dni = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        System.out.print("Peso (kg): ");
                        double peso = scanner.nextDouble();
                        System.out.print("Altura (cm): ");
                        int altura = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        // Crear y añadir la persona al array
                        personas[contadorPersonas] = new Persona(nombre, apellido, dni, edad, peso, altura);
                        contadorPersonas++;
                        System.out.println("Persona añadida correctamente.");
                    } else {
                        System.out.println("El sistema está lleno. No puedes añadir más personas.");
                    }
                    break;

                case 2: // Mostrar todas las personas
                    System.out.println("\nLista de personas:");
                    for (int i = 0; i < contadorPersonas; i++) {
                        System.out.println("\nPersona " + (i + 1) + ":");
                        personas[i].mostrarDatos();
                    }
                    break;

                case 3: // Buscar una persona por nombre
                    System.out.print("Introduce el nombre de la persona que quieres buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < contadorPersonas; i++) {
                        if (personas[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("\nPersona encontrada:");
                            personas[i].mostrarDatos();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona con ese nombre.");
                    }
                    break;

                case 4: // Eliminar una persona por nombre
                    System.out.print("Introduce el nombre de la persona que quieres eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    encontrado = false;
                    for (int i = 0; i < contadorPersonas; i++) {
                        if (personas[i].getNombre().equalsIgnoreCase(nombreEliminar)) {
                            // Eliminar la persona desplazando los elementos restantes
                            for (int j = i; j < contadorPersonas - 1; j++) {
                                personas[j] = personas[j + 1];
                            }
                            personas[contadorPersonas - 1] = null; // Borrar el último elemento
                            contadorPersonas--;
                            System.out.println("Persona eliminada correctamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona con ese nombre.");
                    }
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}