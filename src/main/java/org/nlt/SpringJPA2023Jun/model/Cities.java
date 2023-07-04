package org.nlt.SpringJPA2023Jun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int status;




public Cities() {
	super();
	// TODO Auto-generated constructor stub
}
public Cities(int id, String name, int status) {
	super();
	this.id = id;
	this.name = name;
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}


}
