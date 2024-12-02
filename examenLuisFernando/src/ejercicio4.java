import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[][] personas = new String[10][4];
        int contadorPersonas = 0;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                if (contadorPersonas < 10) {
                    System.out.println("Introduce los datos:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();

                    // Guardar en el array
                    personas[contadorPersonas][0] = nombre;
                    personas[contadorPersonas][1] = apellido;
                    personas[contadorPersonas][2] = telefono;
                    personas[contadorPersonas][3] = dni;
                    contadorPersonas++;

                    System.out.println("Persona agregada correctamente.");
                } else {
                    System.out.println("La lista está llena.");
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}
