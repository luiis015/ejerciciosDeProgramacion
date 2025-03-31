package Equipo;

public class Jugador {
    private String nombre;
    private String posicion;
    private int habilidad;

    public Jugador(String nombre, String posicion, int habilidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }
}
