package apuntes.examcorre;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class controladora3 {
    private Hashtable <String, Object[]> listaAgenda;

    public controladora3(){
        listaAgenda = new Hashtable<>();

    }
    //agendaConctacto
    public void agregarContaacto(String dni, String nombre, String apellido,
                                 int telefono, boolean disponibilidad){
        Object[] contacto = new Object[]{dni, nombre, apellido,telefono,disponibilidad};
        if (listaAgenda.containsKey(contacto[0])){
            System.out.println("No se puede, Contacto ya existente ");
        }
        else{
            listaAgenda.put(contacto[0].toString(),contacto);
        }
    }
    // buscarContacto
    public void buscarContacto(String dni) {
        if (!listaAgenda.containsKey(dni)) {
            System.out.println("Contacto no encontrado.");
        } else {
            Object[] contacto = listaAgenda.get(dni);
            System.out.println("Contacto encontrado:");
            System.out.println("DNI: " + contacto[0]);
            System.out.println("Nombre: " + contacto[1]);
            System.out.println("Apellido: " + contacto[2]);
            System.out.println("Teléfono: " + contacto[3]);
            System.out.println("Disponibilidad: " + ((boolean) contacto[4] ? "Disponible" : "No disponible"));
        }
    }
    //borrarContacto
    public void borrarContacto(String dni) {
        if (!listaAgenda.containsKey(dni)) {
            System.out.println(" Contacto ya existente ");
        } else {
            listaAgenda.remove(dni);
        }
    }
        //listaContacto
    public void listaContactos(){

        Enumeration<String>claves = listaAgenda.keys();
        while (claves.hasMoreElements()){
            String clave = claves.nextElement();
            buscarContacto(clave);
        }

    }





}
