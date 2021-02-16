package InterfaceTest;

public class CarService {

	public void drive() {
		/*
		BMW bmw = new BMW();
		Porsche porsche = new Porsche();
		Mercedes mercedes = new Mercedes(); //  Mercedes implements Car, Asset, Loggable {
		
		bmw.drive();
		bmw.value();
		bmw.owner();
		
		Car bmw2 = new BMW();   // it's better to reference an interface Car
		bmw2.drive();
		
		porsche.drive();
		
		mercedes.drive();
		mercedes.display();
		mercedes.value();
		mercedes.message();
		
		Asset mercedes2 = new Mercedes();
		mercedes2.value();
		
		Loggable mercedes3 = new Mercedes();
		mercedes3.message();

		// it's better to reference an interface Car
		Car b = new BMW();
		Car p = new Porsche();
		Car m = new Mercedes();
		*/
		
		
		Car[] cars = {new BMW(), new Porsche("Marcus"), new Mercedes(), };
		
		for (Car car : cars) {
			car.display();
			car.drive();
		}
		
		
	}
}
