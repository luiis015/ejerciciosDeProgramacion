package ejCalseT5.ej3.Llamdas;

public class LlamadaLocal {

    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private double duracion;

    public LlamadaLocal(long nOrigen, long nDestino, double duracion) {
        this.numeroOrigen = nOrigen;
        this.numeroDestino = nDestino;
        this.duracion = duracion;
        // Calculando el coste
        this.coste = (duracion * 0.15) + 0.50;
    }


    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void mostrarDatos() {
        System.out.println("Llamada Local");
        System.out.println("Numero Origen: " + numeroOrigen);
        System.out.println("Numero Destino: " + numeroDestino);
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Coste: " + coste + "€");
    }
}