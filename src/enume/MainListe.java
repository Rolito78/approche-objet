package enume;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MainListe {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"Henry",12, Sexe.HOMME));
        users.add(new User(2,"Marie",45, Sexe.FEMME));
        users.add(new User(3,"Berna",80, Sexe.HOMME));
        users.add(new User(4,"Julie",5, Sexe.FEMME));

        List<User> user = users.stream().filter(a -> a.getAge()>40).collect(Collectors.toList());

        for (User user1 : user) {
            System.out.println("1 : "+user1.getNom());
        }

        List<String> userF = users.stream().filter( a -> a.getAge() > 20 && a.getSexe() == Sexe.FEMME).map(a -> a.getNom().toUpperCase(Locale.ROOT)).collect(Collectors.toList());

        for (String user1 : userF) {
            System.out.println("2 : "+user1);
        }

        List<User> reduc10 = users.stream().collect(Collectors.toList());
        reduc10.forEach(b -> b.setAge(b.getAge()-10));

        for (User user1 : reduc10) {
            System.out.println("3 : "+user1.getAge());
        }

        List<User> trieUser = users.stream().sorted((u1, u2)-> u1.getAge() - u2.getAge()).collect(Collectors.toList());

        for (User user1 : trieUser) {
            System.out.println("4 : "+user1.getNom());
        }
    }
}
