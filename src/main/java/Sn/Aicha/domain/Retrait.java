package Sn.Aicha.domain;

import java.util.Date;

public class Retrait extends Operation {
    public Retrait() {
    }

    public Retrait(String dateoperation, double montant) {
        super(dateoperation, montant);
    }
}
