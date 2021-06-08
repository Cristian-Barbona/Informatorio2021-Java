package COMPLEMENTARIOS1;

import java.util.Scanner;

public class Level1EJ4 {
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = scan.nextInt();
        scan.close();

        int i = 1;
        int resultado = 1;
        while (i < numero || i == numero){
            resultado = resultado * i;
            i++;
        }
        System.out.println("El factorial es:"+resultado);
    }
}
