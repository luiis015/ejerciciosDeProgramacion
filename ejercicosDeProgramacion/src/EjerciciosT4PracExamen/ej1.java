package EjerciciosT4PracExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Reserva {
    int numeroHabitacion;
    String nombreHuesped;
    String telefonoHuesped;
    String dniHuesped;
    int numeroPersonas;

    public Reserva(int numeroHabitacion, String nombreHuesped, String telefonoHuesped, String dniHuesped, int numeroPersonas) {
        this.numeroHabitacion = numeroHabitacion;
        this.nombreHuesped = nombreHuesped;
        this.telefonoHuesped = telefonoHuesped;
        this.dniHuesped = dniHuesped;
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public String toString() {
        return "Habitación: " + numeroHabitacion + ", Huésped: " + nombreHuesped + ", DNI: " + dniHuesped + ", Teléfono: " + telefonoHuesped + ", Personas: " + numeroPersonas;
    }
}

public class ej1 {
    static final int NUM_HABITACIONES = 20;
    static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarReserva(scanner);
                    break;
                case 2:
                    cancelarReserva(scanner);
                    break;
                case 3:
                    mostrarReservaHuesped(scanner);
                    break;
                case 4:
                    mostrarReservasOrdenadas();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("\n--- Gestión de Reservas del Hotel ---");
        System.out.println("1. Registrar reserva");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Mostrar reserva de un huésped");
        System.out.println("4. Mostrar reservas ordenadas por número de habitación");
        System.out.println("5. Salir");
    }

    static void registrarReserva(Scanner scanner) {
        if (reservas.size() >= NUM_HABITACIONES) {
            System.out.println("Error: No hay habitaciones disponibles.");
            return;
        }

        System.out.print("Introduce el número de habitación (1-" + NUM_HABITACIONES + "): ");
        int numeroHabitacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Introduce el nombre del huésped: ");
        String nombreHuesped = scanner.nextLine();

        System.out.print("Introduce el teléfono del huésped: ");
        String telefonoHuesped = scanner.nextLine();

        System.out.print("Introduce el DNI del huésped: ");
        String dniHuesped = scanner.nextLine();

        System.out.print("Introduce el número de personas: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (Reserva reserva : reservas) {
            if (reserva.dniHuesped.equals(dniHuesped)) {
                System.out.println("Error: El huésped ya tiene una reserva activa.");
                return;
            }
        }

        reservas.add(new Reserva(numeroHabitacion, nombreHuesped, telefonoHuesped, dniHuesped, numeroPersonas));
        System.out.println("Reserva registrada con éxito.");
    }

    static void cancelarReserva(Scanner scanner) {
        System.out.print("Introduce el DNI del huésped para cancelar la reserva: ");
        String dniHuesped = scanner.nextLine();

        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).dniHuesped.equals(dniHuesped)) {
                reservas.remove(i);
                System.out.println("Reserva cancelada con éxito.");
                return;
            }
        }

        System.out.println("Error: No se encontró ninguna reserva con ese DNI.");
    }

    static void mostrarReservaHuesped(Scanner scanner) {
        System.out.print("Introduce el DNI del huésped: ");
        String dniHuesped = scanner.nextLine();

        for (Reserva reserva : reservas) {
            if (reserva.dniHuesped.equals(dniHuesped)) {
                System.out.println("Reserva encontrada: " + reserva);
                return;
            }
        }

        System.out.println("Error: No se encontró ninguna reserva con ese DNI.");
    }

    static void mostrarReservasOrdenadas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        ArrayList<Reserva> reservasOrdenadas = new ArrayList<>(reservas);
        reservasOrdenadas.sort(Comparator.comparingInt(r -> r.numeroHabitacion));

        System.out.println("\nReservas ordenadas por número de habitación:");
        for (Reserva reserva : reservasOrdenadas) {
            System.out.println(reserva);
        }
    }
}







