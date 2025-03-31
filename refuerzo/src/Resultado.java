import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {

        System.out.println("di que numeros quieres operar");
        Scanner Scanner = new Scanner (System.in);


        System.out.println("dime el primer numero");
        int n1 = Scanner.nextInt();
        System.out.println("dime el segundo numero");
        int n2 = Scanner.nextInt();
int resulSum = n1 + n2;
        System.out.println( "el numero final es el " + resulSum);

    }
}