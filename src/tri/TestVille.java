package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 478000));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        villes.sort(new ComparatorNom());
        for (Ville ville : villes) {
            System.out.println(ville.getNom());
        }
    }
}
