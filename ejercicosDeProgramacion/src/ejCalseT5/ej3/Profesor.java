package ejCalseT5.ej3;

import java.util.Scanner;
public class Profesor {

    public void ponerNotas(Alumno alumno) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas del alumno:");

        // Nota para Base de Datos
        System.out.print("Nota para Base de Datos: ");
        double notaBaseDeDatos = scanner.nextDouble();
        alumno.getBaseDeDatos().setCalificacion(notaBaseDeDatos);

        // Nota para Programación
        System.out.print("Nota para Programación: ");
        double notaProgramacion = scanner.nextDouble();
        alumno.getProgramacion().setCalificacion(notaProgramacion);

        // Nota para Lenguaje de Marcas
        System.out.print("Nota para Lenguaje de Marcas: ");
        double notaLenguajeDeMarcas = scanner.nextDouble();
        alumno.getLenguajeDeMarcas().setCalificacion(notaLenguajeDeMarcas);
    }

    public double calcularMedia(Alumno alumno) {
        double suma = alumno.getBaseDeDatos().getCalificacion() +
                alumno.getProgramacion().getCalificacion() +
                alumno.getLenguajeDeMarcas().getCalificacion();
        return suma / 3; // Devuelve la media
    }
}