package Sn.Aicha.domain;



public class Operation {
    private int id;
    private String code;
    private String typeOperation;
    private String dateoperation;
    private double montant;

    private Compte compte;
    private Employe employe;

    public Operation() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Operation(String code, String typeOperation) {
        this.code = code;
        this.typeOperation = typeOperation;
    }

    public Operation(String typeOperation) {
        this.typeOperation = typeOperation;
    }


    public Operation(String typeOperation, String dateoperation, double montant) {
        this.typeOperation = typeOperation;
        this.dateoperation = dateoperation;
        this.montant = montant;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Operation(String dateoperation, double montant) {
        this.dateoperation = dateoperation;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateoperation() {
        return dateoperation;
    }

    public void setDateoperation(String dateoperation) {
        this.dateoperation = dateoperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
