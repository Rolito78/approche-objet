package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France ", 65000000, "Europe"));
        pays.add(new Pays("Allemagne ", 80000000, "Europe"));
        pays.add(new Pays("Belgique ", 10000000, "Europe"));
        pays.add(new Pays("Russie ", 150000000, "Asie"));
        pays.add(new Pays("Chine ", 1400000000, "Asie"));
        pays.add(new Pays("Indonésie ", 220000000, "Oceanie"));
        pays.add(new Pays("Australie ", 20000000, "Oceanie"));

        HashMap<String, Integer> paysParContinent = new HashMap<>();

        for (Pays p : pays) {
            paysParContinent.merge(p.getContinent(), 1, Integer::sum);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : paysParContinent.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
    }
}
