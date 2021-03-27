package Sn.Aicha.repository;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Operation;

public interface OperationRepository {
    public Operation addOperation(Operation op,String codeCompte,int idEmployee);
    Operation[] getAll();
  /*  public void versement(String codeCompte,double mnt,int idEmployee);
    public void retrait(String codeCompte,double mnt,int idEmployee);
    public void virement(String codeCompte1,String codeCompte2,double mnt,int idEmployee);
  */
}
