package Sn.Aicha.repository;

import Sn.Aicha.domain.Employe;

import java.util.List;

public interface EmployeeRepository {
    public Employe addEmployee(Employe employe);
    public List<Employe> getEmployee();
}
