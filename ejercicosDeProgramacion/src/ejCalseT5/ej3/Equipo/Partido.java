package ejCalseT5.ej3.Equipo;

public class Partido {
    Equipo equipoA;
    Equipo equipoB;
    boolean enJuego;
    int parte;

    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.enJuego = true;
        this.parte = 1;
    }

    public void iniciarPartido() {
        for (int i = 0; i < 3; i++) {
            if (equipoA.atacar() && equipoA.nivelAtaque > equipoB.nivelDefensa) {
                System.out.println(equipoA.nombre + " ha marcado un gol!");
            }
            if (equipoB.atacar() && equipoB.nivelAtaque > equipoA.nivelDefensa) {
                System.out.println(equipoB.nombre + " ha marcado un gol!");
            }
            System.out.println("El resultado es " + equipoA.nombre + " " + equipoA.goles + " - " + equipoB.goles + " " + equipoB.nombre);
        }
        enJuego = false;
    }

    public void mostrarResultado() {
        System.out.println("Resultado final: " + equipoA.nombre + " " + equipoA.goles + " - " + equipoB.goles + " " + equipoB.nombre);
    }
}
