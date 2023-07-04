package org.nlt.SpringJPA2023Jun;

import java.util.Optional;

import org.nlt.SpringJPA2023Jun.model.Employees;
import org.nlt.SpringJPA2023Jun.model.Persons;
import org.nlt.SpringJPA2023Jun.repositories.EmployeeRepository;
import org.nlt.SpringJPA2023Jun.repositories.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpa2023JunApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap= SpringApplication.run(SpringJpa2023JunApplication.class, args);
		
		System.out.println("My Main Class");
		
//		PersonRepository personRepo = ap.getBean(PersonRepository.class);
////		
////		Persons person=new Persons();
////		person.setAge(21);
////		person.setName("KAju");
////		person.setPhone(13555550);
////		person.setStatus(1);
////		
////		personRepo.save(person);
//		
//		
////		EmployeeRepository empRepo=ap.getBean(EmployeeRepository.class);
////		Employees emp=new Employees();
////		emp.setName("Hon. Sir Ashish Bhau");
////		emp.setAge(21);
////		emp.setPhone(5666333);
////		emp.setStatus(1);
////		
////		empRepo.save(emp);
//		
//		
//		Iterable<Persons> findAll = personRepo.findAll();
//		findAll.forEach(P->System.out.println(P.getName()+" "+P.getAge()));
//		
//		
//		Optional<Persons> findById = personRepo.findById(1);
//		Persons p = findById.get();
//		System.out.println(p.getAge());	
//		System.out.println(p.getName());	
		//ap.close();
	}

}
