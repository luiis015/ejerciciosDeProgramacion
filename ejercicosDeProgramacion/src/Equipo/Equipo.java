package Equipo;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int ataque;
    private int centro;
    private int defensa;
    private ArrayList<Jugador> jugadores;
    private int goles;


    public Equipo(String nombre, int ataque, int centro, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.centro = centro;
        this.defensa = defensa;
        this.jugadores = new ArrayList<>();
        this.goles = 0;
    }


    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }


    public boolean atacar() {

        double probabilidad = Math.random();
        if (probabilidad < 0.5) {
            goles++;
            return true;
        }
        return false;
    }

    public int getGoles() {
        return goles;
    }
}