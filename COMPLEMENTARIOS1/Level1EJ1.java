package COMPLEMENTARIOS1;

import java.util.*;

public class Level1EJ1 {
    public static void main(String[] args) {

        System.out.println("Ingrese su nombre: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        imprimeUsuario(usuario);
        scan.close();

    }

    public static void imprimeUsuario(String a) {

        System.out.println("Hola " +a+"!!!");

    } 
}
