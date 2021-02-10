package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> entier = new ArrayList<Integer>();
        int i=1;
        while(i<=100){
            entier.add(i);
            i++;
        }
        System.out.println(entier.size());
    }
}
