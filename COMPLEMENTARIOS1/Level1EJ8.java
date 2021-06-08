package COMPLEMENTARIOS1;

import java.util.*;

public class Level1EJ8 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese nombre y apellido:");
            String nombre = scan.nextLine();
            System.out.println("Ingrese su edad:");
            String edad = scan.nextLine();
            System.out.println("Ingrese su dirección:");
            String direccion = scan.nextLine();
            System.out.println("Ingrese su ciudad:");
            String ciudad = scan.nextLine();
            scan.close();
            String output = String.format("\n\n%s - %s - %s - %s", ciudad, direccion, edad, nombre);
            System.out.println(output);
    }
}
