package Sn.Aicha.domain;

import java.util.Date;

public class CompteCourant extends Compte{
    private double decouvert;
    public CompteCourant() {
      super();
    }

    public CompteCourant(String code, Date date, String solde, double decouvert) {
        super(code, date, solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
