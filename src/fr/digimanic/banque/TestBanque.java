package fr.digimanic.banque;

import fr.digimanic.banque.entites.Compte;
import fr.digimanic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque {

    public static void main(String[] args) {

        /*
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(3000);
        comptes[1] = new CompteTaux(2000,15);

        for(Compte compte : comptes){
        System.out.println(compte);
        }
         */

        Compte moi = new Compte(1000);
        CompteTaux tauxmoi= new CompteTaux(1200,12);

        ArrayList<Compte> liste = new ArrayList<Compte>();

        liste.add(moi);
        liste.add(tauxmoi);

        for (Compte element : liste){
            System.out.println(element);
        }
    }
}