package Tema8;

public class Entrada {

    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();

        // Comentar o descomentar según lo que quieras probar
        // operacionesFicheros.leerInformacion();
        // operacionesFicheros.crearDirectorio("src/recursos/escritura/completa");
        // operacionesFicheros.crearFichero("src/recursos/lectura/ejemplo_lectura.txt");
        // operacionesFicheros.lecturaUnitaria("src/recursos/lectura/ejemplo_lectura.txt");
        // operacionesFicheros.lecturaCodigoCompleta("src/recursos/lectura/ejemplo_lectura_codigo.txt");

        // Llamada al método para escribir datos personales en el fichero "datos.txt"
        operacionesFicheros.escribirDatosPersonales("src/recursos/escritura/completa/datos.txt");
    }
}