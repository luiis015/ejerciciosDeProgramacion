package Equipo;

import java.util.ArrayList;

public class Clasificacion {
    private ArrayList<Equipo> equipos;

    public Clasificacion() {
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void mostrarClasificacion() {

        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = 0; j < equipos.size() - i - 1; j++) {
                if (equipos.get(j).getGoles() < equipos.get(j + 1).getGoles()) {

                    Equipo temp = equipos.get(j);
                    equipos.set(j, equipos.get(j + 1));
                    equipos.set(j + 1, temp);
                }
            }
        }


        System.out.println("Clasificación de la liga:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre() + " - Goles: " + equipos.get(i).getGoles());
        }
    }
}