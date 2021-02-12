package enume;

import enume.Instrument;

public class Main {
    public static void main(String[] args) {
        Instrument piano = (morceau, duree) -> System.out.println("Morceau :"+morceau+" Durée : "+duree);
    }
}
