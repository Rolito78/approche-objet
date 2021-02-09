package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(4,"rue truc","94320","Thiais");
        AdressePostale adresse2 = new AdressePostale(12,"rue blabla","94600","Choisy-le-roi");

        Personne personne1 = new Personne("Essai","Test",adresse1);
        Personne personne2 = new Personne("Truc","Machin",adresse2);

        System.out.println(personne1.getAdresse().getVille());
    }

}