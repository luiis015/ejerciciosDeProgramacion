package ejCalseT5.ej3;

public class Entrada {
    public static void main(String[] args) {
        // 1. Crear tres asignaturas (a mano)
        Asignatura baseDeDatos = new Asignatura(1, "Base de Datos");
        Asignatura programacion = new Asignatura(2, "Programación");
        Asignatura lenguajeDeMarcas = new Asignatura(3, "Lenguaje de Marcas");

        // 2. Crear un alumno con las tres asignaturas (a mano)
        Alumno alumno = new Alumno(baseDeDatos, programacion, lenguajeDeMarcas);

        // 3. Crear un profesor
        Profesor profesor = new Profesor();

        // 4. El profesor pone notas al alumno (ingresadas manualmente)
        profesor.ponerNotas(alumno);

        // 5. Mostrar las notas del alumno
        System.out.println("\nNotas del alumno:");
        System.out.println("Base de Datos: " + alumno.getBaseDeDatos().getCalificacion());
        System.out.println("Programación: " + alumno.getProgramacion().getCalificacion());
        System.out.println("Lenguaje de Marcas: " + alumno.getLenguajeDeMarcas().getCalificacion());

        // 6. Calcular y mostrar la media del alumno
        double media = profesor.calcularMedia(alumno);
        System.out.println("\nMedia del alumno: " + media);
    }
}