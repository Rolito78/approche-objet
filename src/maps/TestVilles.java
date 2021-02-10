package maps;

import set.Pays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TestVilles {
    public static void main(String[] args) {
        HashMap<String,Villes> mapVilles = new HashMap<>();

        Villes ville1 = new Villes("Nice", 343000);
        Villes ville2 = new Villes("Carcassonne", 478000);
        Villes ville3 = new Villes("Narbonne", 53400);

        mapVilles.put("Ville1",ville1);
        mapVilles.put("Ville2",ville2);
        mapVilles.put("Ville3",ville3);

       mapVilles.remove(mapVilles.entrySet().stream().min(Comparator.comparing(o -> o.getValue().getNbHabitant())).get().getKey());
       // mapVilles.remove(mapVilles.entrySet().stream().min((o1, o2) -> (int) (o1.getValue().getNbHabitant() - o2.getValue().getNbHabitant())).get().getKey());
        for (Villes value : mapVilles.values()) {
           System.out.println(value.getNom());
        }
    }
}
