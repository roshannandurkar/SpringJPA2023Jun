package org.nlt.SpringJPA2023Jun.controller;

import java.time.LocalTime;

import org.nlt.SpringJPA2023Jun.model.Persons;
import org.nlt.SpringJPA2023Jun.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	

	@Autowired
	private PersonService personService;

	public PersonController()
	{
		System.out.println("Hello PersonController");
	}
	
	@RequestMapping(value="/testlink",method=RequestMethod.GET)
	public String demo()
	{
		System.out.println(personService);
		return LocalTime.now().toString();
	}
	
	@RequestMapping(value="/person",method=RequestMethod.POST)
	public String addPerson(@RequestBody Persons person)
	{
		boolean result=personService.addPersonService(person);
		if(result)
		{
			return person.getName()+" Record Submitted";
		}
		else
		{
			return "Can Not Submit Record";	
		}
	}
}
