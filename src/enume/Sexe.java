package enume;

public enum Sexe {
    FEMME("Femme"),HOMME("Homme");
    private String sexe;

    Sexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
