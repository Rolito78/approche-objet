package stream;

public class User {    private String nom;
    private int age;    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }    public String getNom() {
        return nom;
    }    public void setNom(String nom) {
        this.nom = nom;
    }    public int getAge() {
        return age;
    }    public void setAge(int age) {
        this.age = age;
    }    @Override
    public String toString() {
        return "User{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }}
