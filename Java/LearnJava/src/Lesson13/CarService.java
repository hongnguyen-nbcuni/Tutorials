package Lesson13;

public class CarService {

	public void process(String input) throws Exception {
		
		CarState carState = CarState.from(input);
		
		System.out.println("this is string : " + input);
		
	}

	
}
