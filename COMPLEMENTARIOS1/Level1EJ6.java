package COMPLEMENTARIOS1;

import java.util.Scanner;
public class Level1EJ6 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese un número entero:");
            int a = scan.nextInt();
            System.out.println("Ingrese otro número entero:");
            int b = scan.nextInt();
            scan.close();

            int resultado = 1;
            for (int i=1; i != b; i++){
                resultado = resultado * a;
            }
            System.out.println("El resultado de la potencia es:"+(resultado*a));
    }
}
