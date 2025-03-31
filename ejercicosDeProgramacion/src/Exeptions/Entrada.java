package Exeptions;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
        int opcion;

        do {
            System.out.println( "-------BIENVENIDO AL MENÚ-----------");
            System.out.println("SELECCIONA UNA OPCIÓN");
            System.out.println("1. Rellenar nombre.");
            System.out.println("2. Rellenar apellidos.");
            System.out.println("3. Rellenar DNI.");
            System.out.println("4. Finalizar.");
            scanner.nextLine();
            opcion = scanner.nextInt();
        }
        while (opcion < 1 || opcion > 4);
        scanner.nextInt();
    }




    }

