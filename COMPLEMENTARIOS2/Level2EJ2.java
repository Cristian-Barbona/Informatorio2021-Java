package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ2 {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main (String[] arg) {

    List<Integer> entero = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int iteracion = 1;
    for (int i=0;i<5;i++){
        System.out.print("Ingrese "+iteracion+"° número entero: ");
        int numero = scan.nextInt();
        entero.add(numero);
        iteracion++;
    }

    LinkedList<Integer> principioFin = new LinkedList<Integer>();
    principioFin.addAll(entero);
    System.out.print("Ingrese un número entero al principio de la lista: ");
    int inicio = scan.nextInt();
    principioFin.addFirst(inicio);
    System.out.print("Ingrese un número entero al final de la lista: ");
    int ultimo = scan.nextInt();
    principioFin.addLast(ultimo);
    scan.close();

    clearScreen();

    System.out.print("Números ingresados inicialmente:");
    for (int i=0;i<5;i++){
        System.out.print(" "+entero.get(i));
    }
    System.out.println("");
    System.out.println("Cantidad de números ingresados: "+entero.size());

    System.out.println(" ");

    System.out.print("Lista definitiva:");
    for (int i=0;i<7;i++){
        System.out.print(" "+principioFin.get(i));
    }
    System.out.println("");
    System.out.print("Cantidad de números ingresados: "+principioFin.size());
    }
}
