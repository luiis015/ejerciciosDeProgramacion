package ejCalseT5.ej3.ejProfe;

public class Entrada {
    public static void main(String[] args) {

        Asignatura baseDeDatos = new Asignatura(1, "Base de Datos");
        Asignatura programacion = new Asignatura(2, "Programación");
        Asignatura lenguajeDeMarcas = new Asignatura(3, "Lenguaje de Marcas");

        Alumno alumno = new Alumno(baseDeDatos, programacion, lenguajeDeMarcas);


        Profesor profesor = new Profesor();

        profesor.ponerNotas(alumno);

        System.out.println("\nNotas del alumno:");
        System.out.println("Base de Datos: " + alumno.getBaseDeDatos().getCalificacion());
        System.out.println("Programación: " + alumno.getProgramacion().getCalificacion());
        System.out.println("Lenguaje de Marcas: " + alumno.getLenguajeDeMarcas().getCalificacion());

        double media = profesor.calcularMedia(alumno);
        System.out.println("\nMedia del alumno: " + media);
    }
}