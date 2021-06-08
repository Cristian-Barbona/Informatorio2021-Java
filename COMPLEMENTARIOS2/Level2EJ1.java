package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ1 {
    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        agregaLista(ciudades);
        verRanking(ciudades);

    }

    public static List<String> agregaLista(List<String> l) {

        l.add("Córdoba");
        l.add("Buenos Aires");
        l.add("Bariloche");
        l.add("Salta");
        return l;
    }

    public static void verRanking(List<String> l) {

        for (int i = 1; i <= l.size(); i++) {
            System.out.println("#" + i + " " + l.get(i-1));
        }
    }
}
