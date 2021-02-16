package InheritanceTest;

import InterfaceTest.Loggable;

public class Dog extends Animal implements Loggable {
	

	public void eat() {		// since eat() is abstract, this needs to be implemented here
		System.out.println("Dog is eating ...");
	}
	
	public void print() {
		System.out.println("printing ...");
	}
	
	public String message() {
		return "I'm a dog";
	}
}
