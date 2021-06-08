package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<Integer>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        List<Integer> valorXHora = new ArrayList<Integer>();
        valorXHora.add(350);
        valorXHora.add(345);
        valorXHora.add(550);
        valorXHora.add(600);
        valorXHora.add(320);
    
        List<Integer> totalDiario = new ArrayList<Integer>();
        for (int i=0;i<horasTrabajadas.size();i++){
            int resultado = horasTrabajadas.get(i) * valorXHora.get(i);
            totalDiario.add(resultado);
            }
    
        int totalFinal = 0;
        for (int i=0;i<totalDiario.size();i++){
            totalFinal += totalDiario.get(i);
            }
    
        System.out.println("Total diario:");
        System.out.println(totalDiario);
        System.out.println(" ");
        System.out.println("Total final:");
        System.out.println("$ "+totalFinal);
    
        }
}
