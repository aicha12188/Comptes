package Sn.Aicha.repository.jdbc;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.repository.CompteRepository;

import java.util.ArrayList;
import java.util.List;

public class ListeCompte implements CompteRepository {
    private final List<Compte> comptes;

    public ListeCompte() {
        this.comptes = new ArrayList<Compte>();
    }


    public Compte[] getAllByClient(Client client){
        comptes.add(new Compte(1, "C00012", "epargne", client));
        comptes.add(new Compte(2, "C00013", "epargne", client));
        comptes.add(new Compte(3, "C00014", "epargne", client));

        //return prestataires.toArray();
        return comptes.toArray(new Compte[0]);
    }

    @Override
    public Compte[] getAll() {
        return new Compte[0];
    }

    @Override
    public Compte getAllclient() {
        return null;
    }

    @Override
    public Compte findByCode(String codeCompte) {
        return null;
    }

    @Override
    public Compte getfindById(int id) {
        return null;
    }


    public Compte findById(int idPrestataire) {
        return null;
    }

}
