package lesson2;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

import Lesson10.LoggingLevel;

public class PersonTest {

	private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"}; 


	public String[] states() {  

		return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length); 

	} 

	@Test
	public void shouldReturnHelloWorld() {

		Person marcus = new Person();
		assertEquals("Hello World", marcus.helloWorld());


	}

	@Test	
	public void shouldReturnHelloMarcus() {
		Person person = new Person();
		Person person2 = new Person();

		assertEquals("Hello Marcus", person.hello("Marcus"));
	}

	@Test
	public void shouldReturnNumberOfPersons() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();

		// assertEquals(3, person3.numberOfPersons());    // this also works
		assertEquals(6, Person.numberOfPersons());


		for (String state : MY_STATE_VALUES) {
			if (state.equals("PENDING")) {

			} 
			if (state.equals("PROCESSING")) {

			}
			if (state.equals("PROCESSED")) {

			}
		}


		LoggingLevel state2 = LoggingLevel.PROCESSED;

		for (LoggingLevel state : LoggingLevel.values()) {
			if (state == LoggingLevel.PENDING) {

			} 
			if (state == LoggingLevel.PROCESSING) {

			}
			if (state == LoggingLevel.PROCESSED) {

			}

			System.out.println(state);
		}


	}




}
