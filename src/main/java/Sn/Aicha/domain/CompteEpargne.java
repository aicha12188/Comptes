package Sn.Aicha.domain;

import java.util.Date;

public class CompteEpargne extends Compte {
    private double taux;

    public CompteEpargne() {

    }

    public CompteEpargne(String code, Date date, String solde, double taux) {
        super(code, date, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
