package ejCalseT5.ej3.cochesEj;

public class Motor {
    private int litrosAceite;
    private int cv;

    public Motor(int cv) {
        this.cv = cv;
        this.litrosAceite = 0;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
}
