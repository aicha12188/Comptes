package Sn.Aicha.repository;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.domain.Operation;

import java.util.List;

public interface CompteRepository {
  /*  public Compte addCompte(Compte compte,int idClient,int idEmployee);
    public  Compte consulterCompte(String codeCompte);
    public List<Operation> consulterOperation(String code);
    public List<Compte> getCompteByClient(int idClient);
    public List<Compte> getCompteByEmployee(int idEmployee);
*/
  Compte[] getAllByClient(Client client);
  Compte[] getAll();
  Compte getAllclient();
    Compte findByCode(String codeCompte);
  Compte getfindById(int id);

}
