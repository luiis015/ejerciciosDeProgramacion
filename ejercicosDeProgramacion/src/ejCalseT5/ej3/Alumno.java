package ejCalseT5.ej3;

public class Alumno {

    private Asignatura baseDeDatos;
    private Asignatura programacion;
    private Asignatura lenguajeDeMarcas;

    // Constructor con tres parámetros de tipo Asignatura
    public Alumno(Asignatura baseDeDatos, Asignatura programacion, Asignatura lenguajeDeMarcas) {
        this.baseDeDatos = baseDeDatos;
        this.programacion = programacion;
        this.lenguajeDeMarcas = lenguajeDeMarcas;
    }

    // Getters para las asignaturas
    public Asignatura getBaseDeDatos() {
        return baseDeDatos;
    }

    public Asignatura getProgramacion() {
        return programacion;
    }

    public Asignatura getLenguajeDeMarcas() {
        return lenguajeDeMarcas;
    }
}