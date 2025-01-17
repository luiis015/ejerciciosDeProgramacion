package apuntes.ejemploCoches;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random  random= new Random();
        ArrayList<Coche>coches = new ArrayList<>();
        System.out.println("introduuce los datos de los 6 participantes");
        for (int i = 1; i <= 6; i++) {
            System.out.println("\nCoche " + i + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();


            Coche coche = new Coche(marca, modelo, color);
            coches.add(coche);
        }

        System.out.println("introduce el numero de vueltas: ");
        int vueltas = scanner.nextInt();


        // simular la carrera de los coches ;

        System.out.println("iniciando la carrera....");
        for (int i = 0; i < vueltas; i++) {
            System.out.println("vuelta ");


            for (int j = 0; j < random.nextInt(26)+50; j++) {

            }

        }






    }
}