package TP5.EX1;

public class Professeur {

    // vars
    private int id = 0;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Specialite specialite;

    // constructor
    Professeur(Specialite specialite, String nom, String prenom, String telephone, String email) {
        this.specialite = specialite;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;

        // auto increment
        id ++;
    }

    // getter & setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return telephone;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.telephone = tel;
    }

    // toString meth
    public String toString() {
        return "-- nom : " + nom + "\n" + "prenom : " + prenom + "\n" + "numéro tel : " + telephone + "\n" + "e-mail : " + email + "\n" + "Specialitée : " + specialite.getLibelle() + "\n";
    }
}