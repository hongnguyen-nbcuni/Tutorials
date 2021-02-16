package EqualsAndHashcode;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;



public class CarTest {

	@Test
	public void primitivesShouldBeEqual() {
		int i = 4;
		int j = 4;
		
		assertTrue(i == j);			// this equals
	}
	
	@Test
	public void stringShouldBeEqual() {
		String hello1 = "Hello";
		String hello2 = "Hello";		// these both point to the same object in memory
		
		assertTrue(hello1 == hello2);	// this equals
		
		String hello3 = "H";
		hello3 = hello3 + "ello";
		System.out.println(hello3);				// Hello
		
		System.out.println(hello1 == hello3);	// false
		
		assertTrue(hello1.equals(hello3)); 		// true
		
		
	}
	
	/*
	
	@Test
	public void porscheShouldBeEqual() {
		Car myPorsche1 = new Car("Marcus", "Porsche", "silver");
		Car myPorsche2 = new Car("Marcus", "Porsche", "silver");
		
		// assertTrue(myPorsche1 == myPorsche2);				// false
		
		// assertTrue(myPorsche1.equals(myPorsche2));			// false, this compares the reference
		
		assertTrue(myPorsche1 == myPorsche1); 				// true
		
		myPorsche2 = myPorsche1; 					// assign myPorsche1 reference to myPorsche2

		assertTrue(myPorsche1.equals(myPorsche2));         // true
		
	}
	*/
	
}


