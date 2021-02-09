package fr.digimanic.banque.entites;

public class Compte {
    private static int increment = 1;
    private int numCompte;
    private double solde;

    public Compte(double solde) {
        this.numCompte = increment;
        this.solde = solde;
        increment++;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }

    public static int getIncrement() {
        return increment;
    }

    public static void setIncrement(int increment) {
        Compte.increment = increment;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
