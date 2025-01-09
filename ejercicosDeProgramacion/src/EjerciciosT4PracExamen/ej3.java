package EjerciciosT4PracExamen;

import java.util.*;

class Piloto {
    String nombre;
    String bastidorCoche;
    int puntos;

    public Piloto(String nombre, String bastidorCoche, int puntos) {
        this.nombre = nombre;
        this.bastidorCoche = bastidorCoche;
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Bastidor: " + bastidorCoche + ", Puntos: " + puntos;
    }
}

public class ej3 {
    static final int MAX_PILOTOS = 10;
    static final int NUM_CARRERAS = 7;
    static Hashtable<String, Piloto> pilotos = new Hashtable<>();
    static int carrerasRealizadas = 0;

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
                    agregarPiloto(scanner);
                    break;
                case 2:
                    actualizarPuntos();
                    break;
                case 3:
                    mostrarInformacionPiloto(scanner);
                    break;
                case 4:
                    mostrarClasificacion();
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
        System.out.println("\n--- Gestión de Campeonato de Fórmula 1 ---");
        System.out.println("1. Agregar piloto");
        System.out.println("2. Actualizar puntos");
        System.out.println("3. Mostrar información de un piloto");
        System.out.println("4. Mostrar clasificación");
        System.out.println("5. Salir");
    }

    static void agregarPiloto(Scanner scanner) {
        if (pilotos.size() >= MAX_PILOTOS) {
            System.out.println("Error: No se pueden agregar más pilotos.");
            return;
        }

        System.out.print("Introduce el nombre del piloto: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el bastidor del coche: ");
        String bastidorCoche = scanner.nextLine();

        if (pilotos.containsKey(bastidorCoche)) {
            System.out.println("Error: Ya existe un piloto con este bastidor.");
            return;
        }

        Piloto nuevoPiloto = new Piloto(nombre, bastidorCoche, 0);
        pilotos.put(bastidorCoche, nuevoPiloto);
        System.out.println("Piloto agregado con éxito.");
    }

    static void actualizarPuntos() {
        if (carrerasRealizadas >= NUM_CARRERAS) {
            System.out.println("Error: No se pueden repartir más puntos, ya se han realizado todas las carreras.");
            return;
        }

        if (pilotos.isEmpty()) {
            System.out.println("Error: No hay pilotos registrados.");
            return;
        }

        List<Integer> puntosDisponibles = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            puntosDisponibles.add(i);
        }
        Collections.shuffle(puntosDisponibles);

        Iterator<String> bastidores = pilotos.keySet().iterator();
        for (int i = 0; i < pilotos.size() && !puntosDisponibles.isEmpty(); i++) {
            String bastidor = bastidores.next();
            Piloto piloto = pilotos.get(bastidor);
            int puntosRepartidos = puntosDisponibles.remove(0);
            piloto.puntos += puntosRepartidos;
            System.out.println("Se le han añadido " + puntosRepartidos + " puntos a " + piloto.nombre);
        }

        carrerasRealizadas++;
        System.out.println("Puntos actualizados para la carrera " + carrerasRealizadas + ".");
    }

    static void mostrarInformacionPiloto(Scanner scanner) {
        System.out.print("Introduce el bastidor del coche: ");
        String bastidorCoche = scanner.nextLine();

        Piloto piloto = pilotos.get(bastidorCoche);
        if (piloto == null) {
            System.out.println("Error: No se encontró un piloto con ese bastidor.");
        } else {
            System.out.println("Información del piloto: " + piloto);
        }
    }

    static void mostrarClasificacion() {
        if (pilotos.isEmpty()) {
            System.out.println("No hay pilotos registrados.");
            return;
        }

        List<Piloto> clasificacion = new ArrayList<>(pilotos.values());
        clasificacion.sort((p1, p2) -> Integer.compare(p2.puntos, p1.puntos));

        System.out.println("\nClasificación actual del campeonato:");
        for (int i = 0; i < clasificacion.size(); i++) {
            Piloto piloto = clasificacion.get(i);
            System.out.println((i + 1) + ". " + piloto);
        }
    }
}
