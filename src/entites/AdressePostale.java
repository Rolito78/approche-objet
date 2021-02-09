package entites;

public class AdressePostale {
    private int numRue;
    private String libelleRue;
    private String cp;
    private String ville;


    public AdressePostale(int numRue, String libelleRue,String cp, String ville)
    {
        this.numRue = numRue;
        this.libelleRue = libelleRue;
        this.cp = cp;
        this.ville = ville;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

