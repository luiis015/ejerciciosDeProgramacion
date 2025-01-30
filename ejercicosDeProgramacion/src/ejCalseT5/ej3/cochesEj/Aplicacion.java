package ejCalseT5.ej3.cochesEj;

public class Aplicacion {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche coche1 = new Coche("Toyota", "Corolla", "1234ABC");
        Coche coche2 = new Coche("Ford", "Mustang", "5678DEF");


        for (int i = 0; i < 2; i++) {
            if (garaje.aceptarCoche(coche1, "aceite")) {
                garaje.devolverCoche();
            }
            if (garaje.aceptarCoche(coche2, "frenos")) {
                garaje.devolverCoche();
            }
        }

        System.out.println("Información del Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Matrícula: " + coche1.getMatricula());
        System.out.println("Precio de averías: " + coche1.getPrecioAverias());
        System.out.println("Litros de aceite: " + coche1.getMotor().getLitrosAceite());

        System.out.println("\nInformación del Coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Matrícula: " + coche2.getMatricula());
        System.out.println("Precio de averías: " + coche2.getPrecioAverias());
        System.out.println("Litros de aceite: " + coche2.getMotor().getLitrosAceite());
    }
}