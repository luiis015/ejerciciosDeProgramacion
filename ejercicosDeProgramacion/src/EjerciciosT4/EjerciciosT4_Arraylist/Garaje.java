package EjerciciosT4.EjerciciosT4_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {

}


class Coche {
    String marca;
    String modelo;
    int caballos;
    String matricula;
}

class GestionCoches {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coches por marca");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                if (coches.size() >= 5) {
                    System.out.println("No se pueden añadir más coches.");
                } else {
                    Coche coche = new Coche();
                    System.out.print("Introduce la marca: ");
                    coche.marca = scanner.nextLine();
                    System.out.print("Introduce el modelo: ");
                    coche.modelo = scanner.nextLine();
                    System.out.print("Introduce los caballos: ");
                    coche.caballos = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    System.out.print("Introduce la matrícula: ");
                    coche.matricula = scanner.nextLine();

                    boolean existe = false;
                    for (int i = 0; i < coches.size(); i++) {
                        if (coches.get(i).matricula.equals(coche.matricula)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Ya existe un coche con esa matrícula.");
                    } else {
                        coches.add(coche);
                        System.out.println("Coche añadido.");
                    }
                }
            } else if (opcion == 2) {
                if (coches.size() == 0) {
                    System.out.println("No hay coches en el garaje.");
                } else {
                    for (int i = 0; i < coches.size(); i++) {
                        Coche c = coches.get(i);
                        System.out.println("Modelo: " + c.modelo + "\tMarca: " + c.marca + "\tCV: " + c.caballos + "\tMatrícula: " + c.matricula);
                    }
                }
            } else if (opcion == 3) {
                System.out.print("Introduce la marca a buscar: ");
                String marcaBuscada = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < coches.size(); i++) {
                    Coche c = coches.get(i);
                    if (c.marca.equalsIgnoreCase(marcaBuscada)) {
                        System.out.println("Modelo: " + c.modelo + "\tMarca: " + c.marca + "\tCV: " + c.caballos + "\tMatrícula: " + c.matricula);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("No hay coches de esa marca.");
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        System.out.println("Saliendo del programa...");

    }
}
