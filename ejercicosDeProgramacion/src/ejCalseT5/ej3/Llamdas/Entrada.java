package ejCalseT5.ej3.Llamdas;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Centralita centralita = new Centralita();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar llamada local");
            System.out.println("2. Agregar llamada nacional");
            System.out.println("3. Mostrar datos de llamadas locales");
            System.out.println("4. Mostrar datos de llamadas nacionales");
            System.out.println("5. Mostrar coste acumulado");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce el número de origen: ");
                long nOrigen = sc.nextLong();
                System.out.print("Introduce el número de destino: ");
                long nDestino = sc.nextLong();
                System.out.print("Introduce la duración en segundos: ");
                double duracion = sc.nextDouble();
                LlamadaLocal llamadaLocal = new LlamadaLocal(nOrigen, nDestino, duracion);
                centralita.agregarLocal(llamadaLocal);
            } else if (opcion == 2) {
                System.out.print("Introduce el número de origen: ");
                long nOrigen = sc.nextLong();
                System.out.print("Introduce el número de destino: ");
                long nDestino = sc.nextLong();
                System.out.print("Introduce la duración en segundos: ");
                double duracion = sc.nextDouble();
                System.out.print("Introduce el destino (A, B, C): ");
                char destino = sc.next().charAt(0);
                LlamadaNacional llamadaNacional = new LlamadaNacional(nOrigen, nDestino, duracion, destino);
                centralita.agregarNacional(llamadaNacional);
            } else if (opcion == 3) {
                centralita.listarLocales();
            } else if (opcion == 4) {
                centralita.listarNacionales();
            } else if (opcion == 5) {
                centralita.mostrarCostes();
            } else if (opcion == 6) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }

    }
}