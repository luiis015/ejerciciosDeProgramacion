package Model;

public class audio extends  Elemento{
    private int duracion;
    private String soporte;


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Soporte: " + soporte);
    }
}
