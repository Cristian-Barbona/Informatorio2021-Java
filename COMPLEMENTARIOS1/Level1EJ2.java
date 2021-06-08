package COMPLEMENTARIOS1;

import java.util.Scanner;

public class Level1EJ2 {
    public static void main(String[] args) {

        System.out.println("Introduzca dos números enteros: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num + "+" + num2 + "=" + sumar(num, num2));
        System.out.println(num + "-" + num2 + "=" + restar(num, num2));
        System.out.println(num + "*" + num2 + "=" + multiplicar(num, num2));
        System.out.println(num + "/" + num2 + "=" + dividir(num, num2));
        scan.close();
    }

    public static int sumar (int a, int b) {
        return a + b;
    }
    public static int restar (int a, int b) {
        return a - b;
    }
    public static int multiplicar (int a, int b) {
        return a * b;
    }
    public static int dividir (int a, int b) {
        return a / b;
    }
}
