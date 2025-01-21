package apuntes.ejemploCoches;

public class Coche {

    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par,km;




    public Coche() {
        matricula = "sin definir";
        modelo = "sin definir";
        marca = "sin definir";
        bastidor = "sin definir";
        color = "sin definir";
        precio = 0.0;
        cv = 0;
        par = 0;
        km = 0; // Inicialización
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        matricula = "sin definir";
        bastidor = "sin definir";
        precio = 0.0;
        cv = 0;
        par = 0;
        km = 0; // Inicialización
    }

    // Método para sumar kilómetros recorridos
    public void sumarKilometros(int distancia) {
        this.km += distancia;
    }

    // Método para obtener los kilómetros recorridos
    public int getKilometros() {
        return km;
    }

    // Método para mostrar datos del coche
    public void mostrarDatos() {
        System.out.println("La marca es: " + this.marca);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El color es: " + this.color);
        System.out.println("Los cv son: " + this.cv);
        System.out.println("El par es: " + this.par);
        System.out.println("El número de bastidor es: " + this.bastidor);
        System.out.println("La matrícula es: " + this.matricula);
        System.out.println("El precio es: " + this.precio);
        System.out.println("Kilómetros recorridos: " + this.km);
    }
}
 /*un coche tineene un atributo km, lo cuales pueden decir la distancia que ha recorrido un coch para
poder hacer una carrera, es necesaria que se pida primero los participantes son 6 los participantes,
 donde debe indicar marca,modelo, matricula, modelo, matricula,cv.
 una vez indidicada todos los participantes, es necesario idnicar cuantas vueltas consta la carrera
 una vez indicada el numero de vueotas la  carrera comienza. para ello en cada vuetla cada coche recorre un
 numero de km aleatorio (50-75)
 Una vez se termina las vueltas el sistema mostrara ;
 el coche ganaddor es xxx xxxx xxxxxx
 la clasificacion final es;
 1. xxxx xxxx xxxx xx waza
 2.xxxx xxxx xxxx xx */
