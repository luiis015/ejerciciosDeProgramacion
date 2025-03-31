package Ejercico9Casa;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Constructora constructora = new Constructora();
        int opcion;

        do {
            System.out.println("\n MENÚ DE CONSTRUCCIÓN:");
            System.out.println("1️ Crear terreno");
            System.out.println("2️ Construir casa");
            System.out.println("3 Construir habitación");
            System.out.println("4️ Construir piscina");
            System.out.println("5️  Construir anexo");
            System.out.println("6️ Revalorizar casa");
            System.out.println("7️ Mostrar datos del terreno y casa");
            System.out.println("0 Salir");
            System.out.print(" Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Metros cuadrados del terreno: ");
                    double m2Terreno = scanner.nextDouble();
                    System.out.print("Valoración inicial (€): ");
                    double valor = scanner.nextDouble();
                    System.out.print("Orientación (1-NORTE, 2-SUR, 3-ESTE, 4-OESTE): ");
                    int orient = scanner.nextInt();
                    Orientacion orientacion = Orientacion.values()[orient - 1];
                    constructora.crearTerreno(m2Terreno, orientacion, valor);
                    break;

                case 2:
                    System.out.print("Metros cuadrados de la casa: ");
                    double m2Casa = scanner.nextDouble();
                    constructora.construirCasa(m2Casa);
                    break;

                case 3:
                    System.out.print("Metros cuadrados de la habitación: ");
                    double m2Habitacion = scanner.nextDouble();
                    constructora.construirHabitacion(m2Habitacion);
                    break;

                case 4:
                    constructora.construirPiscina();
                    break;

                case 5:
                    System.out.print("Metros cuadrados del anexo: ");
                    double m2Anexo = scanner.nextDouble();
                    constructora.construirAnexo(m2Anexo);
                    break;

                case 6:
                    constructora.revalorizarCasa();
                    break;

                case 7:
                    constructora.mostrarDatos();
                    break;

                case 0:
                    System.out.println(" Saliendo...");
                    break;

                default:
                    System.out.println(" Opción no válida.");
            }
        } while (opcion != 0);

    }
}
