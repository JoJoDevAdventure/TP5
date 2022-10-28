package TP5.EX1;

public class Specialite {

    // vars
    private int id = 0;
    private String code;
    private String libelle;

    // constructor
    Specialite(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;

        id ++;
    }

    // getters & setters
    public String getLibelle() {
        return libelle;
    }

    public String getCode() {
        return code;
    }

    // toString meth
    public String toString() {
        return "Specialitée : " + libelle;
    }
}
