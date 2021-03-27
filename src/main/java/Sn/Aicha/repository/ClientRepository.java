package Sn.Aicha.repository;

import Sn.Aicha.domain.Client;

import java.util.List;

public interface ClientRepository {
    /*public Client addClient(Client client) ;
    public Client consulterClient(String nci);
    public List<Client> consulterListClient(String nci);*

     */
    Client[] getAll();
    Client getById(int id);
}
