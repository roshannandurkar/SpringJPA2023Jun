package org.nlt.SpringJPA2023Jun.repositories;

import org.nlt.SpringJPA2023Jun.model.Cities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<Cities, Integer> {

}
