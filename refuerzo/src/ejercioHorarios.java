import java.util.Scanner;

public class ejercioHorarios  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la edad del alumno");
        int edad = scanner.nextInt();


        if ( edad >= 3 && edad <=6) {
            System.out.println("El horario es de de 17-18 ");

        } else if ( edad >= 7 && edad<=8) {
            System.out.println("El horario es de de 17:30- 18:30 ");
        }
        else if ( edad >= 9 && edad<=10) {
            System.out.println("El horario es de de 18:30- 19:30 ");
        }
        else if ( edad >= 11 && edad<=13) {
            System.out.println("El horario es de de 19:30- 20:30 ");
        }
        else  {
            System.out.println("La edad introducida no es valida");
        }

}

    }

