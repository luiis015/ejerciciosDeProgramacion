package Model;

public class audio extends  Elemento{
    private int duracion;
    private String soporte;

    public Audio(int id, String titulo, Persona autor, int tamaño, String formato, int duracion, String soporte) {
        super(id, titulo, autor, tamaño, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Soporte: " + soporte);
    }
}
