import java.util.Random;

public class ejercico1 {
    public static void main(String[] args) {
        int [] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            int numeroAleatorio;
            numeroAleatorio = random.nextInt(17);
            System.out.println("los numeros sin ordenar son los siguientes " + numeroAleatorio);
        }







    }
}
