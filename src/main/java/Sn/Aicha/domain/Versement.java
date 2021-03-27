package Sn.Aicha.domain;

import java.util.Date;

public class Versement extends Operation {
    public Versement() {
    }

    public Versement(String dateoperation, double montant) {
        super(dateoperation, montant);
    }
}
