package ejCalseT5.ej3.Llamdas;

import java.util.ArrayList;

public class Centralita {
    private ArrayList<LlamadaLocal> listaLocales;
    private ArrayList<LlamadaNacional> listaNacionales;
    private int costeAcumulado;

    public Centralita() {
        listaLocales = new ArrayList<>();
        listaNacionales = new ArrayList<>();
        costeAcumulado = 0;
    }

    public void agregarLocal(LlamadaLocal llamada) {
        listaLocales.add(llamada);
    }

    public void agregarNacional(LlamadaNacional llamada) {
        listaNacionales.add(llamada);
    }


    public void listarLocales() {
        for (LlamadaLocal llamada : listaLocales) {
            llamada.mostrarDatos();
        }
    }

    public void listarNacionales() {
        for (LlamadaNacional llamada : listaNacionales) {
            llamada.mostrarDatos();
        }
    }


    public void mostrarCostes() {
        for (LlamadaLocal llamada : listaLocales) {
            costeAcumulado += llamada.getCoste();
        }
        for (LlamadaNacional llamada : listaNacionales) {
            costeAcumulado += llamada.getCoste();
        }
        System.out.println("Coste acumulado: " + costeAcumulado + "€");
    }


    public ArrayList<LlamadaLocal> getListaLocales() {
        return listaLocales;
    }

    public void setListaLocales(ArrayList<LlamadaLocal> listaLocales) {
        this.listaLocales = listaLocales;
    }

    public ArrayList<LlamadaNacional> getListaNacionales() {
        return listaNacionales;
    }

    public void setListaNacionales(ArrayList<LlamadaNacional> listaNacionales) {
        this.listaNacionales = listaNacionales;
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}
