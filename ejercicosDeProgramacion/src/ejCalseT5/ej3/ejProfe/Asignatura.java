package ejCalseT5.ej3.ejProfe;
public class Asignatura {

    private int identificador;
    private String nombre;
    private double calificacion;


    public Asignatura(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.calificacion = 0.0; // Inicializamos la calificación en 0
    }


    public int getIdentificador() {
        return identificador;
    }


    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}