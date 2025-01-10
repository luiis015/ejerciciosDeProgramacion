package apuntes;

public class borrar { // Nombre de la clase
    // Propiedades
    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par;

    // Constructor
    public borrar() { // Cambiado para que coincida con el nombre de la clase
        matricula = "sin definir";
        modelo = "sin definir";
        marca = "sin definir";
        bastidor = "sin definir";
        color = "sin definir";
        // Inicializar el objeto y por ende los atributos de este
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("La marca es: " + this.marca);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El color es: " + this.color);
        System.out.println("Los cv son: " + this.cv);
        System.out.println("El par es: " + this.par);
        System.out.println("El bastidor es: " + this.bastidor);
        System.out.println("La matrícula es: " + this.matricula);
        System.out.println("El precio es: " + this.precio);
    }

    // Método principal
    public static void main(String[] args) {
        borrar miCoche = new borrar();

    }


}