package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ3 {
    public static void main (String[] arg) {

        List<Integer> baraja = new ArrayList<Integer>();
        int numero = 2;
        for (int i=0;i<9;i++){
            baraja.add(numero);
            numero++;
        }
    
        System.out.print("Baraja: ");
        for (int i=0;i<baraja.size();i++) {
            System.out.print(" "+baraja.get(i));
            }
    
            System.out.println(" ");
            Scanner enter = new Scanner(System.in);
            String continuar;
        try {
            System.out.println("Presione ENTER para ver la baraja a la inversa");
            continuar = enter.nextLine();
            System.out.print("Baraja inversa: ");
            for (int i = baraja.size()-1;i>=0;i--) {
                System.out.print(" "+baraja.get(i));
            }
            System.out.println(" ");
            System.out.println("Presione ENTER para mezclar la baraja");
            }
        catch(Exception e) { }
    
        try {
            continuar = enter.nextLine();
            Collections.shuffle(baraja);
            System.out.print("Baraja mezclada: ");
            for (int i=0;i<baraja.size();i++){
                System.out.print(" "+baraja.get(i));
            }
        enter.close();
        }
        catch(Exception e) { }
        }
}
