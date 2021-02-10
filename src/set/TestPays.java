package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Locale;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        Pays pays1 = new Pays("USA",434334,62794.59);
        Pays pays2 = new Pays("France",123132,41463.64);
        Pays pays3 = new Pays("Allemagne",2321,47603.03);
        Pays pays4 = new Pays("UK",42943.90,37750);
        Pays pays5 = new Pays("Italie",112123,34483.20);
        Pays pays6 = new Pays("Japon",23232323,39289.96);
        pays.add(pays1);
        pays.add(pays2);
        pays.add(pays3);
        pays.add(pays4);
        pays.add(pays5);
        pays.add(pays6);

        Pays riche = pays.stream().max(Comparator.comparing(Pays::getPibHabitant)).get();
        Pays pibTotalPlusIm = pays.stream().max(Comparator.comparingInt(ville -> (int) (ville.getPibHabitant() * ville.getNbHabitant()))).get();

        Pays lowerPibTotalCountry = pays.stream().min((o1, o2) -> (int)(o1.getPibHabitant()*o1.getNbHabitant() - o2.getPibHabitant()*o2.getNbHabitant())).get();
        pays.remove(lowerPibTotalCountry);
        lowerPibTotalCountry.setNom(lowerPibTotalCountry.getNom().toUpperCase(Locale.ROOT));

        pays.add(lowerPibTotalCountry);

        for (Pays pay : pays) {
            System.out.println(pay);
        }

    }
}
