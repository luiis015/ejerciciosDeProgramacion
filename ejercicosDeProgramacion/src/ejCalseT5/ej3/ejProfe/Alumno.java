package ejCalseT5.ej3.ejProfe;

public class Alumno {

    private Asignatura baseDeDatos;
    private Asignatura programacion;
    private Asignatura lenguajeDeMarcas;


    public Alumno(Asignatura baseDeDatos, Asignatura programacion, Asignatura lenguajeDeMarcas) {
        this.baseDeDatos = baseDeDatos;
        this.programacion = programacion;
        this.lenguajeDeMarcas = lenguajeDeMarcas;
    }


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