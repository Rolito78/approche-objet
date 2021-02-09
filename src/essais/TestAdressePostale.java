package essais;

import entites.AdressePostale;
public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale objet1 = new AdressePostale(4,"rue truc","94320","Thiais");
        AdressePostale objet2 = new AdressePostale(12,"rue blabla","94600","Choisy-le-roi");

        System.out.println(objet1.getLibelleRue());
    }
}
