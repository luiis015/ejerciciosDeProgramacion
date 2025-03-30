package ejEXPrac;

import java.util.ArrayList;
import java.util.Scanner;

public class EquiposChampions {
    private ArrayList <String> equipos;
    private Scanner scanner;


    public EquiposChampions() {
        equipos = new ArrayList<>();  // Creamos una lista vacía
        scanner = new Scanner(System.in);  // Preparamos para leer input
    }


    public void equiposQueVanAChampions () {
        System.out.println("DI 4 EQUIPOS QUE IRAN A CHAMPIONS");
        for (int i = 0; i < 4; i++) {
            System.out.println("equipo numero " + i);
            String Equipo = scanner.nextLine();
            equipos.add(Equipo);
        }
    }
    public void mostrarEquiposChampions() {
        if (equipos.isEmpty()) {
            System.out.println("\nNo hay ningún equipo registrado.");
            return;
        }

        System.out.println("\n--- Equipos clasificados para Champions ---");
        int numero = 1;
        for (String equipo : equipos) {
            System.out.println(numero + ". " + equipo);
            numero++;
        }
    }

}



