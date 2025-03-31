package Equipo;

import java.util.ArrayList;

public class Liga {
    private ArrayList<Equipo> equipos;

    public Liga() {
        equipos = new ArrayList<>();
    }

    public void inscribirEquipo(Equipo equipo) {
        if (equipos.size() < 10) {
            equipos.add(equipo);
        } else {
            System.out.println("La liga ya tiene 10 equipos inscritos.");
        }
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
}