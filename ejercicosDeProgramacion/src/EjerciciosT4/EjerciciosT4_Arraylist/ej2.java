package EjerciciosT4.EjerciciosT4_Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ej2 {
    //Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase.
    // Una vez creado, sacará el nombre de uno de los compañeros (aleatorio)

    public static void main(String[] args) {
        ArrayList<String > companeros  = new ArrayList<>();
        companeros.add("Ivan");
        companeros.add("Dani");
        companeros.add("Rubem");
        companeros.add("Luis");
        companeros.add("Hugo");
        companeros.add("Valentino");
        companeros.add("Esteban");
        companeros.add("Eugenio");
        companeros.add("Alexander");
        Random random = new Random();
        int indiceAleatorio = random.nextInt(companeros.size());

        // Obtener el nombre del compañero usando el índice aleatorio
        String companeroAleatorio = companeros.get(indiceAleatorio);

        // Imprimir el nombre seleccionado al azar
        System.out.println("El compañero seleccionado al azar es: " + companeroAleatorio);
    }




    }

