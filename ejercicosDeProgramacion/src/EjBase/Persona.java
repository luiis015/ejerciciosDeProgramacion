package EjBase;
public class Persona {
    // Propiedades
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double peso;
    private int altura;

    // Constructores
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this(nombre, apellido, dni, edad, 0, 0);
    }

    public Persona(String nombre, String apellido) {
        this(nombre, apellido, "111111111X", 0, 0, 0);
    }

    public Persona() {
        this("datos por defecto", "datos por defecto", "111111111X", 0, 0, 0);
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para mostrar datos formateados
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }

    // Método para incrementar la edad
    public void incrementarEdad(int incremento) {
        this.edad += incremento;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        if (altura == 0) return 0; // Evitar división por cero
        double alturaEnMetros = altura / 100.0;
        return peso / (alturaEnMetros * alturaEnMetros);
    }
}