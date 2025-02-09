package Equipo;

public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    private boolean enJuego;
    private int parte;


    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.enJuego = true;
        this.parte = 1;
    }


    public void iniciarPartido() {
        System.out.println("¡El partido ha comenzado!");
        realizarAtaques(1);  // Primera parte
        System.out.println("\nComienza la segunda parte...");
        parte = 2;
        realizarAtaques(2);  // Segunda parte
    }


    private void realizarAtaques(int parte) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ataque " + i + " - " + (parte == 1 ? "Primera parte" : "Segunda parte") + ":");

            boolean golEquipoA = equipoA.atacar();
            boolean golEquipoB = equipoB.atacar();

            System.out.println("EquipoA " + (golEquipoA ? "ha marcado gol." : "no ha marcado gol."));
            System.out.println("EquipoB " + (golEquipoB ? "ha marcado gol." : "no ha marcado gol."));
            System.out.println("Resultado actual: EquipoA " + equipoA.getGoles() + " - EquipoB " + equipoB.getGoles());
        }
    }


    public void mostrarResultado() {
        System.out.println("\nEl resultado final es:");
        System.out.println("EquipoA " + equipoA.getGoles() + " - EquipoB " + equipoB.getGoles());
    }
}