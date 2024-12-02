package EjerciciosT4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio7Arrays {
    public static void main(String[] args) {
        // Array con 20 palabras
        String[] palabras = {
                "programacion", "java", "ordenador", "teclado", "pantalla",
                "raton", "memoria", "disco", "procesador", "ventilador",
                "monitor", "codigo", "variable", "metodo", "array",
                "bucle", "clase", "objeto", "funcion", "compilador"
        };

        // Seleccionar una palabra al azar
        Random random = new Random();
        String palabraSeleccionada = palabras[random.nextInt(palabras.length)];

        // Crear un array de caracteres para mostrar el progreso del jugador
        char[] progreso = new char[palabraSeleccionada.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_'; // Inicialmente mostrar guiones bajos
        }

        int vidas = 5; // Número de vidas
        boolean palabraAcertada = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego del ahorcado.");
        System.out.println("Intenta adivinar la palabra:");
        System.out.println(String.valueOf(progreso));

        // Bucle principal del juego
        while (vidas > 0 && !palabraAcertada) {
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    progreso[i] = letra; // Actualizar el progreso si la letra es correcta
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Acertaste una letra!");
            } else {
                vidas--;
                System.out.println("Letra incorrecta. Te quedan " + vidas + " vidas.");
            }

            System.out.println(String.valueOf(progreso)); // Mostrar el progreso actual

            // Comprobar si se ha adivinado toda la palabra
            palabraAcertada = String.valueOf(progreso).equals(palabraSeleccionada);
        }

        // Resultado final
        if (palabraAcertada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Lo siento, te has quedado sin vidas. La palabra era: " + palabraSeleccionada);
        }

    }
}
