package Sn.Aicha.repository.jdbc;

import Sn.Aicha.domain.Client;
import Sn.Aicha.repository.ClientRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class clientdao implements ClientRepository {

    private final DataSource dataSource;

    public clientdao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Client[] getAll() {
        try {
            ResultSet rs = dataSource.getResultSet("SELECT * FROM client");

            List<Client> prestations = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nci = rs.getString("nci");
                String adresse = rs.getString("adresse");
                Client prestation = new Client(id, nom,prenom,adresse,nci);
                prestations.add(prestation);
            }
            return prestations.toArray(new Client[0]);
        }
        catch (Exception ex){
            return new Client[0];
        }

    }

    @Override
    public Client getById(int id) {
        try {
            String query = "SELECT * FROM client where id = ? ";

            ResultSet resultSet = dataSource.getResultSet(query, id);
            String nom = resultSet.getString("nom");
            String prenom = resultSet.getString("prenom");
            String nci = resultSet.getString("nci");
            String adresse = resultSet.getString("adresse");
            return new Client(id, nom,prenom,nci,adresse);
        }
        catch (Exception ex){
            return null;
        }

    }





}