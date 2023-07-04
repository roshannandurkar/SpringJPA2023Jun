package org.nlt.SpringJPA2023Jun.repositories;

import org.nlt.SpringJPA2023Jun.model.Persons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//this class will receive all power of crud from cr
@Repository
public interface PersonRepository extends CrudRepository<Persons, Integer> {

}
