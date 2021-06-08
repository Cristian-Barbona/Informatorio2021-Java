package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ7 {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void mostrarMultiplos (int n, int m){
        List<Integer> listarNumeros = new ArrayList<Integer>();
        if(n < m){
            for (int i = n; i < m; i++){
                listarNumeros.add(i);
            }
        }else{
            clearScreen();
            System.out.print("Advertencia! El primer número debe ser menor");
        }

        String[] resultado = new String[listarNumeros.size()];
        for (int i=0;i<listarNumeros.size();i++){
            if (listarNumeros.get(i) % 2 == 0 && listarNumeros.get(i) % 3 == 0) {
                resultado[i] = "FizzBuzz";
            }
            else if (listarNumeros.get(i) % 3 == 0) {
                resultado[i] = "Buzz";
            }
            else if (listarNumeros.get(i) % 2 == 0) {
                resultado[i] = "Fizz";
            } else {
                String numero = String.valueOf(listarNumeros.get(i));
                resultado[i] = numero;
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(resultado));
    }
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un número entero menor:");
        int a = scan.nextInt();
        System.out.println("Introduzca un número entero mayor:");
        int b = scan.nextInt();
        scan.close();

        mostrarMultiplos(a, b);
    }
}
