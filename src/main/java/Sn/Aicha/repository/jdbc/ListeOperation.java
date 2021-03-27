package Sn.Aicha.repository.jdbc;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.domain.Operation;
import Sn.Aicha.repository.CompteRepository;
import Sn.Aicha.repository.OperationRepository;

import java.util.ArrayList;
import java.util.List;

public class ListeOperation implements OperationRepository {
    private final List<Operation> operations;

    public ListeOperation() {
        this.operations = new ArrayList<Operation>();
    }


    @Override
    public Operation addOperation(Operation op, String codeCompte, int idEmployee) {
        return null;
    }

  public   Operation[] getAll() {
        operations.add(new Operation("Versement"));
        operations.add(new Operation("Retrait"));


        //return prestataires.toArray();
        return operations.toArray(new Operation[0]);
    }

}