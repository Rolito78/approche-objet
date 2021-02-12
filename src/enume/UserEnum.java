package enume;

public class UserEnum {
    private int id;
    private String nom;
    private int age;
    private Sexe sexe;

    public User(int id, String nom, int age, Sexe sexe) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
}
