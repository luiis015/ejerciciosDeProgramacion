package Ejercico9Casa;

public class Constructora {
    private Terreno terreno;

    public void crearTerreno(double metros, Orientacion orientacion, double valor) {
        terreno = new Terreno(metros, orientacion, valor);
        System.out.println(" Terreno creado.");
    }

    public void construirCasa(double metros) {
        try {
            if (terreno == null) throw new Exception(" No hay un terreno creado.");
            terreno.construirCasa(metros);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void construirHabitacion(double metros) {
        try {
            if (terreno.getCasa() == null) return;
            terreno.getCasa().construirHabitacion(metros);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void construirPiscina() {
        try {
            if (terreno.getCasa() == null) return;
            terreno.getCasa().construirPiscina();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void construirAnexo(double metros) {
        try {
            if (terreno.getCasa() == null) return;
            terreno.getCasa().construirAnexo(metros);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void revalorizarCasa() {
        if (terreno == null) {
            System.out.println(" No hay terreno para revalorizar.");
            return;
        }
        terreno.revalorizarCasa();
    }

    public void mostrarDatos() {
        if (terreno == null) {
            System.out.println(" No hay terreno.");
            return;
        }
        terreno.mostrarDatos();
    }
}