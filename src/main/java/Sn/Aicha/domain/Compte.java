package Sn.Aicha.domain;

import java.util.Date;
import java.util.List;

public class Compte {
    private int id;
    private String code;
    private String typeCompte;
    private Date date;
    private String solde;
    private Employe employe;
    private Client client;
    private List<Operation> operation;

    public Compte() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Compte(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public Compte(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Compte(String code, Date date, String solde) {
        this.code = code;
        this.date = date;
        this.solde = solde;
    }

    public Compte(String code, String typeCompte, Date date, String solde, Employe employe, Client client, List<Operation> operation) {

        this.code = code;
        this.typeCompte = typeCompte;
        this.date = date;
        this.solde = solde;
        this.employe = employe;
        this.client = client;
        this.operation = operation;
    }

    public Compte(String code, String typeCompte) {
        this.code = code;
        this.typeCompte = typeCompte;
    }

    public Compte(int id, String code, String solde) {
        this.id = id;
        this.code = code;
        this.solde = solde;
    }

    public Compte(String code, String typeCompte, String solde) {
        this.code = code;
        this.typeCompte = typeCompte;
        this.solde = solde;
    }

    public Compte(int id, String code, String typeCompte, Client client) {
        this.id = id;
        this.code = code;
        this.typeCompte = typeCompte;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }
}
