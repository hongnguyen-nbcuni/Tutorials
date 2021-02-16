package lesson2;

import lesson3.Name;

public class Person {

	private Name personName;
	private static int countPerson;
	
	public Person(Name personName) {
		this.personName = personName;
	}
	
	public Person() {
		
		countPerson++;
		/*
		 empty on purpuse - default constructor
		 */
	}
	
	public String helloWorld() {
		
		return "Hello World";
	}
	
	public Name name() {
		return personName;
	}

	public String hello(String person) {
		
		return "Hello " + person;
		
	}

	public static int numberOfPersons() {
		// TODO Auto-generated method stub
		return countPerson;
	}
	

}
