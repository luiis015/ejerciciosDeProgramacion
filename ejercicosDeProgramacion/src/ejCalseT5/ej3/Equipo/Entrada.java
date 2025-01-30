package ejCalseT5.ej3.Equipo;

public class Entrada {
    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Tigres");
        Equipo equipoB = new Equipo("Leones", 85, 80, 75);

        equipoA.agregarJugador(new Jugador("Carlos", "delantero", 92));
        equipoA.agregarJugador(new Jugador("Miguel", "defensa", 78));
        equipoB.agregarJugador(new Jugador("Pedro", "delantero", 88));
        equipoB.agregarJugador(new Jugador("Juan", "centrocampista", 81));

        Partido partido = new Partido(equipoA, equipoB);
        partido.iniciarPartido();
        partido.mostrarResultado();
    }
}
