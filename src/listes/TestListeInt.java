package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println("La taille de la liste est de : "+entiers.size());


        entiers.remove(entiers.indexOf(Collections.min(entiers)));

        System.out.println("Le plus grand nombre est : "+Collections.max(entiers));

        for(int i =0; i < entiers.size(); i++)
        {
            entiers.set(i,Math.abs(entiers.get(i)));
        }
        for (Integer entier : entiers) {
            System.out.println(entier);
        }
    }
}
