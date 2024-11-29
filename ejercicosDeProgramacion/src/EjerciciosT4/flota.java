package EjerciciosT4;

public class flota {
    public static void main(String[] args) {
        // Declaración y asignación del array bidimensional
        int[][] numeros = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Cuántas filas tiene
        int numeroFilas = numeros.length;

        // Cuántas columnas tiene cada fila
        int columnasFila1 = numeros[0].length;
        int columnasFila2 = numeros[1].length;
        int columnasFila3 = numeros[2].length;
        int columnasFila4 = numeros[3].length;

        // Sacar el último elemento
        int ultimoNumero = numeros[numeros.length - 1][numeros[numeros.length - 1].length - 1];
        // modificar valor deuna posicion
        numeros[numeros.length - 1][numeros[numeros.length - 1].length - 1] = 99;
        // Imprimir los resultados
        System.out.println("Número de filas: " + numeroFilas);
        System.out.println("Columnas en la fila 1: " + columnasFila1);
        System.out.println("Columnas en la fila 2: " + columnasFila2);
        System.out.println("Columnas en la fila 3: " + columnasFila3);
        System.out.println("Columnas en la fila 4: " + columnasFila4);
        System.out.println("Último número del array: " + ultimoNumero);
    }
}