package apuntes.ejemploCoches;

public class Entrada {
    public static void main(String[] args) {
        // Crear objetos de la clase Coches
        Coches coche1 = new Coches(); // Constructor por defecto
        Coches coche2 = new Coches("Ford", "Focus", "Gris"); // Constructor con parámetros
        Coches coche3 = new Coches("Opel", "Corsa", "Negro"); // Constructor con parámetros

        // Mostrar los datos de cada coche
        System.out.println("\nLos datos del coche 1 son:");
        coche1.mostrarDatos();

        System.out.println("\nLos datos del coche 2 son:");
        coche2.mostrarDatos();

        System.out.println("\nLos datos del coche 3 son:");
        coche3.mostrarDatos();


    }
}