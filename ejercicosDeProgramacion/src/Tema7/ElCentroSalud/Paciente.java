package Tema7.ElCentroSalud;

public class Paciente {
    private String nombre, apelldios,  dolencia ;
    private int NSS;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldios() {
        return apelldios;
    }

    public void setApelldios(String apelldios) {
        this.apelldios = apelldios;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public Paciente(String nombre, String apelldios, String dolencia, int NSS) {
        this.nombre = nombre;
        this.apelldios = apelldios;
        this.dolencia = dolencia;
        this.NSS = NSS;
    }
}
