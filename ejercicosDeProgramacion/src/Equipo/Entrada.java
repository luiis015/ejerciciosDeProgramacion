package Equipo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Liga liga = new Liga();
        Clasificacion clasificacion = new Clasificacion();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa el nombre del equipo " + i + ": ");
            String nombreEquipo = scanner.nextLine();

            System.out.println("Ingresa los niveles para el " + nombreEquipo + ":");
            System.out.print("Nivel de Ataque: ");
            int nivelAtaque = scanner.nextInt();
            System.out.print("Nivel de Centro: ");
            int nivelCentro = scanner.nextInt();
            System.out.print("Nivel de Defensa: ");
            int nivelDefensa = scanner.nextInt();
            scanner.nextLine();

            Equipo equipo = new Equipo(nombreEquipo, nivelAtaque, nivelCentro, nivelDefensa);


            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingresa el nombre del Jugador " + j + " para el equipo " + nombreEquipo + ": ");
                String nombreJugador = scanner.nextLine();
                System.out.print("Ingresa la posición del jugador: ");
                String posicion = scanner.nextLine();
                System.out.print("Ingresa la habilidad del jugador (0-100): ");
                int habilidad = scanner.nextInt();
                scanner.nextLine();

                Jugador jugador = new Jugador(nombreJugador, posicion, habilidad);
                equipo.agregarJugador(jugador);
            }

        }


        System.out.println("Equipos inscritos en la liga:");
        for (Equipo equipo : liga.getEquipos()) {
            System.out.println(equipo.getNombre());
        }


        Equipo equipoA = liga.getEquipos().get(0);
        Equipo equipoB = liga.getEquipos().get(1);
        Partido partido = new Partido(equipoA, equipoB);
        partido.iniciarPartido();
        partido.mostrarResultado();


        clasificacion.mostrarClasificacion();
    }
}