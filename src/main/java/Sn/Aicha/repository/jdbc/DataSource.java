package Sn.Aicha.repository.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataSource {
    ResultSet getResultSet(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException;

    ResultSet getResultSet(String query, int id) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;
}
