package COMPLEMENTARIOS1;

import java.util.Scanner;

public class Level1EJ3 {
    public static void main(String[] args) {

        System.out.println("Introduzca un número entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        incrementar(a);
        scan.close();

    }

    public static void incrementar (int a) {

        String contenedor = "";
        for (int i = 1; i <= a; i++) {
            String b = Integer.toString(i);
            contenedor += b;
            System.out.println(contenedor);
        }

    }
}
