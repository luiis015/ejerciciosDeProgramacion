package ejEXPrac;

import java.util.Scanner;

public class ejtrycat {
    public static void main(String[] args) {
        EquiposChampions EquiposChampions = new EquiposChampions();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Definir los 4 equipos para Champions");
            System.out.println("2. Ver equipos clasificados a Champions");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        switch (opcion) {

            case 1:
                EquiposChampions.equiposQueVanAChampions();
                break;
            case 2:
                EquiposChampions.mostrarEquiposChampions();
                break;
            default:
                System.out.println("❌ Opción no válida. Introduce 1, 2 o 3.");

        }

        }while (opcion != 3);
    }
}
