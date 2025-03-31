package IF;

import java.util.Scanner;

public class ejif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("introduce la edad de la persona");
      edad = scanner.nextInt();
      if (edad > 17){
          System.out.println( "acceso permitido");

      } else if (edad < 18){
          System.out.println( "acceso denegado");
      }

//hacer un programa en el que el usaurio
// en un menu el usario tendra que escoge
//un opcion del menu y esta pues tendra opciones si las hace mal
// el programa se lo dira

      }
    }
