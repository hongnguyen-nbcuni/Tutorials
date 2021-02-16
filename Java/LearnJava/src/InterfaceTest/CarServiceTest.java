package InterfaceTest;

import org.testng.annotations.Test;

public class CarServiceTest {

	@Test
	public void shouldDemonstrateInterfaces() {
		CarService carService = new CarService();
		carService.drive();
	
	}
}
