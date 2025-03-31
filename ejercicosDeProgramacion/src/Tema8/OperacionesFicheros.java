package Tema8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OperacionesFicheros {

    private int contadorNivel = 0;

    // Método que pide datos personales y un mensaje, y lo guarda en un fichero
    public void escribirDatosPersonales(String path) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos personales
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce tu edad:");
        String edad = scanner.nextLine();

        System.out.println("Introduce tu dirección:");
        String direccion = scanner.nextLine();

        // Pedir un mensaje
        System.out.println("Introduce un mensaje:");
        String mensaje = scanner.nextLine();

        // Escribir los datos en el fichero
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, true); // 'true' para añadir al final del archivo
            fileWriter.write("Nombre: " + nombre + "\n");
            fileWriter.write("Edad: " + edad + "\n");
            fileWriter.write("Dirección: " + direccion + "\n");
            fileWriter.write("Mensaje: " + mensaje + "\n");
            fileWriter.write("----------------------------\n");
        } catch (IOException e) {
            System.out.println("Error en escritura");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }

        System.out.println("Datos guardados correctamente en " + path);
    }

    public void leerInformacion() {
        File file = new File("/Users/luis/Documents/GitHub/ClasePRO");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        for (File fichero : file.listFiles()) {
            recorrerDirectorio(fichero);
        }
    }

    public void crearDirectorio(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void crearFichero(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la escritura del fichero");
            }
        }
    }

    public void recorrerDirectorio(File fichero) {
        for (int i = 0; i < contadorNivel; i++) {
            System.out.print("\t");
        }
        System.out.println(fichero.getName());
        if (fichero.isDirectory()) {
            contadorNivel++;
            for (File f : fichero.listFiles()) {
                recorrerDirectorio(f);
            }
        }
    }

    public void lecturaUnitaria(String path) {
        File file = new File(path);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int lectura = -1;
            while ((lectura = fileReader.read()) != -1) {
                System.out.println("lectura = " + lectura + " asociado a la letra: " + (char) lectura);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura");
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }
    }

    public void lecturaCodigoCompleta(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                stringBuffer.append(linea);
            }
            System.out.println(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura");
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }
    }
}

//cear un sistema de cifrado que dira indica cual es el mensaje a cifrar
//esto es un ejemplo para comprobar si puedo cirfrar este mensaje este mensaje inluye intrucciones de como
//aprobar el examen
// una vez escrito esto dira cual es la fase de cifrado
//la fase de cifradp es 8 es el numero por el que se multiplica el asti de cada letra  es asco
//el mensaje cifrado se escribira en un fichero
//hacer otro metodo que lo escifre este dira "indica cual es la fase de descifrado y yo dire 8
// y luego me dara la frase
// si no coincide mostrara mensajes raros