package Lesson13;

import org.testng.annotations.Test;

public class CarServiceTest {


	@Test
	public void shouldDemonstrateLogging() throws Exception {
		CarService carService = new CarService();
		carService.process("BMW");
		
	}
	
	

}
