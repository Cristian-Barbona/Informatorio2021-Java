package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ4 {
    public static void main(String[] args) {

        List<String> estudiantes = Arrays.asList(
        "Pablo Neruda","Gustavo Cerati","Carlos García","Luis Spinetta"
        ,"Jorge Borges","Fabiana Cantilo","Javier Calamaro","Hilda Lisarazu",
        "Fito Páez","Nito Mestre","Pedro Aznar","Oscar Moro"
        );

        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, estudiantes.size());

        System.out.println("Curso 'A': ");
        for (int i = 0; i < curso1.size(); i++) {
            System.out.println(curso1.get(i));
        }
        System.out.println(" ");

        System.out.println("Curso 'B': ");
        for (int i = 0; i < curso2.size(); i++) {
            System.out.println(curso2.get(i));
        }
        System.out.println(" ");

        System.out.println("Curso 'C': ");
        for (int i = 0; i < curso3.size(); i++) {
            System.out.println(curso3.get(i));
        }
        System.out.println(" ");
    }
}
