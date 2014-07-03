package org.milleni.dunning.datamodel.dao;

public class Person {

	private String firstName;
	private String surname;
	
	public Person(String name, String surname) {
		// TODO Auto-generated constructor stub
		this.firstName = name;
		this.surname = surname;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	
}
