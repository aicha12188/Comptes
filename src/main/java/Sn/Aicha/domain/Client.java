package Sn.Aicha.domain;


import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String nci;
    private String adresse;
    //private List<Compte> comptes;

    public Client(String nom, String prenom, String nci, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.nci = nci;
    }

    public Client(int id, String nom, String prenom, String nci, String adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nci = nci;
    }


    public Client(int id, String nom, String prenom, String nci) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nci = nci;

    }

    public Client(String nom, String prenom, String nci) {
        this.nom = nom;
        this.prenom = prenom;
        this.nci = nci;

    }

    public Client() {

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

}
