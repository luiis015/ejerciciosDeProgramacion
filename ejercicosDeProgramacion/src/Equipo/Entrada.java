package Equipo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el nombre del primer equipo: ");
        String nombreEquipoA = scanner.nextLine();

        System.out.print("Ingresa el nombre del segundo equipo: ");
        String nombreEquipoB = scanner.nextLine();


        System.out.println("Ingresa los niveles para el " + nombreEquipoA + ":");
        System.out.print("Nivel de Ataque: ");
        int nivelAtaqueA = scanner.nextInt();
        System.out.print("Nivel de Centro: ");
        int nivelCentroA = scanner.nextInt();
        System.out.print("Nivel de Defensa: ");
        int nivelDefensaA = scanner.nextInt();


        scanner.nextLine();


        System.out.println("Ingresa los niveles para el " + nombreEquipoB + ":");
        System.out.print("Nivel de Ataque: ");
        int nivelAtaqueB = scanner.nextInt();
        System.out.print("Nivel de Centro: ");
        int nivelCentroB = scanner.nextInt();
        System.out.print("Nivel de Defensa: ");
        int nivelDefensaB = scanner.nextInt();


        Equipo equipoA = new Equipo(nombreEquipoA, nivelAtaqueA, nivelCentroA, nivelDefensaA);
        Equipo equipoB = new Equipo(nombreEquipoB, nivelAtaqueB, nivelCentroB, nivelDefensaB);


        Jugador jugadorA1 = new Jugador("JugadorA1", "Delantero", 95);
        Jugador jugadorB1 = new Jugador("JugadorB1", "Delantero", 92);


        equipoA.agregarJugador(jugadorA1);
        equipoB.agregarJugador(jugadorB1);


        Partido partido = new Partido(equipoA, equipoB);


        partido.iniciarPartido();


        partido.mostrarResultado();


        scanner.close();
    }
}