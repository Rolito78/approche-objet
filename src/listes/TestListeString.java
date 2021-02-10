package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        String grandElement = villes.get(0);
        for (String ville: villes) {

            if(ville.length() > grandElement.length())
            {
                grandElement = ville;
            }
        }
        System.out.println("Mot le plus grand : "+grandElement);
        List<String> collect = villes.stream().map(item -> item.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        List<String> listwithoutN = villes.stream().filter(s -> s.charAt(0) != 'N').collect(Collectors.toList());

        System.out.println(listwithoutN);
    }
}
