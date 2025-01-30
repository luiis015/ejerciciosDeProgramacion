package ejCalseT5.ej3.Equipo;

import java.util.ArrayList;
import java.util.Random;

public class Equipo {
    String nombre;
    int nivelAtaque;
    int nivelCentro;
    int nivelDefensa;
    int goles;
    ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        Random rand = new Random();
        this.nivelAtaque = rand.nextInt(101);
        this.nivelCentro = rand.nextInt(101);
        this.nivelDefensa = rand.nextInt(101);
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, int ataque, int centro, int defensa) {
        this.nombre = nombre;
        this.nivelAtaque = ataque;
        this.nivelCentro = centro;
        this.nivelDefensa = defensa;
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    public boolean atacar() {
        Random rand = new Random();
        double resultado = (nivelAtaque * rand.nextDouble() + (nivelCentro * rand.nextDouble()) / 2);
        if (resultado > 90) {
            goles++;
            return true;
        }
        return false;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void listarDelanteros() {
        for (Jugador j : jugadores) {
            if (j.posicion.equalsIgnoreCase("delantero")) {
                j.mostrarDatos();
            }
        }
    }
}

