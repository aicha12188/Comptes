package Sn.Aicha.repository.jdbc;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.repository.CompteRepository;

public class comptedao implements CompteRepository {


    @Override
    public Compte[] getAllByClient(Client clent) {
        return new Compte[0];
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

}
