package set;

public class Pays {
    private String nom;
    private double nbHabitant;
    private double pibHabitant;

    public Pays(String nom, double nbHabitant, double pibHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.pibHabitant = pibHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(double nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public double getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(double pibHabitant) {
        this.pibHabitant = pibHabitant;
    }
}
