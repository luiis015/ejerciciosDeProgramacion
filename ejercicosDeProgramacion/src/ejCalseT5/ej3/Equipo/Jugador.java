package ejCalseT5.ej3.Equipo;

public class Jugador {
    String nombre;
    String posicion;
    boolean estrella;
    int calidad;

    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        this.estrella = calidad > 90;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Calidad: " + calidad);
        System.out.println("Estrella: " + (estrella ? "Sí" : "No"));
    }
}

