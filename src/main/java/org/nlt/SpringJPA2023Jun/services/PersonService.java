package org.nlt.SpringJPA2023Jun.services;

import org.nlt.SpringJPA2023Jun.model.Persons;
import org.nlt.SpringJPA2023Jun.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepo;
	
	public PersonService()
	{
		System.out.println("PersonService Object Created");
	}
	
	
	
	public boolean addPersonService(Persons person)
	{
		personRepo.save(person);
		return true;
	}
}
