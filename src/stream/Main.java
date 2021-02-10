package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("user1", 42));
        users.add(new User("user2", 12));
        users.add(new User("user3", 33));
        users.add(new User("user4", 88));
        users.add(new User("user5", 99));
        users.add(new User("user6", 7));

        List<User> maNouvelleListe = users.stream().filter(user -> user.getAge() > 40).sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());

        maNouvelleListe.forEach(user -> user.setNom(user.getNom().toUpperCase(Locale.ROOT)));

        for (User user : maNouvelleListe)
        {
            System.out.println(user);
        }

        List<Integer> listeAges = users.stream().map(User::getAge).collect(Collectors.toList());

        int userTotalAges = users.stream().mapToInt(User::getAge).sum();

        double moyenneAges = users.stream().mapToInt(User::getAge).average().orElse(0);

        long combienDeSeniors = users.stream().filter(user -> user.getAge() > 70).count();

        boolean sontIlsTousVieux = users.stream().allMatch(user -> user.getAge() > 80);

        boolean yaTilAuMoinsUnVieux = users.stream().anyMatch(user -> user.getAge() > 80);

    }
}
