package ejCalseT5.ej3.cochesEj;
import java.util.Random;

public class Garaje {
    private Coche cocheActual;
    private String averiaActual;
    private int cochesAtendidos;

    public Garaje() {
        this.cocheActual = null;
        this.averiaActual = "";
        this.cochesAtendidos = 0;
    }

    public boolean aceptarCoche(Coche coche, String averia) {
        if (cocheActual != null) {
            return false; // Ya hay un coche en el garaje
        }
        this.cocheActual = coche;
        this.averiaActual = averia;
        this.cochesAtendidos++;
        return true;
    }

    public void devolverCoche() {
        if (cocheActual != null) {
            if (averiaActual.equals("aceite")) {
                int litrosActuales = cocheActual.getMotor().getLitrosAceite();
                cocheActual.getMotor().setLitrosAceite(litrosActuales + 10);
            } else {
                Random rand = new Random();
                int litrosAleatorios = rand.nextInt(101); // Entre 0 y 100
                int litrosActuales = cocheActual.getMotor().getLitrosAceite();
                cocheActual.getMotor().setLitrosAceite(litrosActuales + litrosAleatorios);
            }
            cocheActual.acumularAveria();
            this.cocheActual = null;
            this.averiaActual = "";
        }
    }
}