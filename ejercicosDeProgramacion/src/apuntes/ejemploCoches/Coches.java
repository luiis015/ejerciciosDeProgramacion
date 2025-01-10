package apuntes.ejemploCoches;

public class Coches {
    // Propiedades
    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par;

    // Constructor por defecto
    public Coches() {
        matricula = "sin definir";
        modelo = "sin definir";
        marca = "sin definir";
        bastidor = "sin definir";
        color = "sin definir";
        precio = 0.0; // Inicializamos con un valor por defecto
        cv = 0;       // Inicializamos con un valor por defecto
        par = 0;      // Inicializamos con un valor por defecto
    }

    // Constructor con parámetros
    public Coches(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        matricula = "sin definir"; // Valores predeterminados para atributos no incluidos
        bastidor = "sin definir";
        precio = 0.0;
        cv = 0;
        par = 0;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("La marca es: " + this.marca);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El color es: " + this.color);
        System.out.println("Los cv son: " + this.cv);
        System.out.println("El par es: " + this.par);
        System.out.println("El número de bastidor es: " + this.bastidor);
        System.out.println("La matrícula es: " + this.matricula);
        System.out.println("El precio es: " + this.precio);
    }
}