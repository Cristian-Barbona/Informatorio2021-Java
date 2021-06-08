package COMPLEMENTARIOS1;

import java.util.*;

public class Level2EJ9 {
    public static void main(String[] args) {

        System.out.println("Introduzca un texto o frase, y luego una letra: ");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String letra = scan.nextLine();
        System.out.print("La letra " +letra + " aparece " + caracteres(frase,letra) + " veces");
        scan.close();
    }

    public static int caracteres(String f, String l) {

        int contador = 0;
        char c = l.charAt(0);
        for (int i = 0; i < f.length(); i++) {
            if (c == f.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
}
