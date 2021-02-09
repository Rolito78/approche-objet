package fr.digimanic.banque.entites;

public class CompteTaux extends Compte{

    private double tauxRemuneration;

    public CompteTaux(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    public String toString(){
        return super.toString()+" le taux de rémunération est : "+tauxRemuneration;
    }
}
