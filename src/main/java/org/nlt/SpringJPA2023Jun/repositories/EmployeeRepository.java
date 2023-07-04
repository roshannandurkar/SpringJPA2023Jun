package org.nlt.SpringJPA2023Jun.repositories;

import org.nlt.SpringJPA2023Jun.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Integer> {

}
