package ejCalseT5.ej3.Llamdas;

public class LlamadaNacional {

    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private int destino;
    private double duracion;


    public LlamadaNacional(long nOrigen, long nDestino, double duracion, char destino) {
        this.numeroOrigen = nOrigen;
        this.numeroDestino = nDestino;
        this.duracion = duracion;
        this.destino = destino == 'A' ? 1 : destino == 'B' ? 2 : destino == 'C' ? 3 : 0;

        switch (this.destino) {
            case 1:
                this.coste = (duracion * 0.40) + 0.50;
                break;
            case 2:
                this.coste = (duracion * 0.50) + 0.50;
                break;
            case 3:
                this.coste = (duracion * 0.60) + 0.50;
                break;
            default:
                this.coste = (duracion * 0.70) + 0.50;
                break;
        }
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

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }


    public void mostrarDatos() {
        System.out.println("Llamada Nacional");
        System.out.println("Numero Origen: " + numeroOrigen);
        System.out.println("Numero Destino: " + numeroDestino);
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Coste: " + coste + "€");
        System.out.println("Destino: " + (destino == 1 ? "A" : destino == 2 ? "B" : destino == 3 ? "C" : "Otro"));
    }
}