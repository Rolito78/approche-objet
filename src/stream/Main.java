package stream;

import java.util.*;
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

        List<String> myList = Arrays.asList("aads", "abbds", "cabfdd", "ac", "babb", "ccab", "bcba", "bbba");

        List<String> myNewList = myList.stream()
            .filter(e -> e.startsWith("a") || e.startsWith("b")) // on filtre par rapport à un boolean
            .map(e -> e.toUpperCase(Locale.ROOT))
            .sorted((s1, s2) -> {
                if (s1.length() > s2.length())
                    return 1;
                else if (s1.length() < s2.length())
                    return -1;
                else
                    return s1.compareTo(s2);
            })
            .collect(Collectors.toList());

        for (String s : myNewList)
        {
            System.out.println(s);
        }

        boolean isOneStartsWithA = myList.stream()
            .anyMatch(s -> s.startsWith("a"));

        boolean allStartsWithA = myList.stream()
            .allMatch(s -> s.startsWith("a"));

        long combienCommencentParA = myList.stream()
            .filter(s -> s.startsWith("a"))
            .count();        int[] test = myList.stream()
            .mapToInt(value -> value.length())
            .toArray();
    }
}
