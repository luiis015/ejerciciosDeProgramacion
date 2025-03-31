package Equipo;

public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;

    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
    }

    public void iniciarPartido() {
        System.out.println("Partido entre " + equipoA.getNombre() + " y " + equipoB.getNombre() + " está comenzando...");
        equipoA.atacar();
        equipoB.atacar();
    }

    public void mostrarResultado() {
        System.out.println("Resultado: " + equipoA.getNombre() + " " + equipoA.getGoles() + " - " + equipoB.getGoles() + " " + equipoB.getNombre());
    }
}