package ejCalseT5.ej3;
public class Asignatura {

    private int identificador;
    private String nombre;
    private double calificacion;


    public Asignatura(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.calificacion = 0.0; // Inicializamos la calificación en 0
    }

    // Getter para el identificador
    public int getIdentificador() {
        return identificador;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para la calificación
    public double getCalificacion() {
        return calificacion;
    }

    // Setter para la calificación
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}