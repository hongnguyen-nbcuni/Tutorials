package Lesson13;

import java.io.IOException;

public class CarSelector {

	public static void main(String[] args) throws Exception {

		CarService carService = new CarService();

		for (String argument : args) {
			/*
			try {
				carService.process(argument);
			} catch (RuntimeException e) {
				// e.printStackTrace();
				System.err.println(e.getMessage());
				
			}
			*/
			isValid(argument);
			carService.process(argument);
			
		}
	}

	private static boolean isValid(String argument) {
		try {
			CarState carstate = CarState.valueOf(argument);
			return true;
		} 
		/*
		catch(IllegalArgumentException e) {
			System.out.println("I'm in catch exception block");
			return false;
		} 
		*/
		catch (RuntimeException e) {
			IOException e2 = new IOException ("my IOException");
			
			throw new RuntimeException(e2);

			// System.out.println("I'm in catch exception block");
			
			// return false;
		}
		
		finally {
			// close the resources
			System.out.println("This is always executed");
		} 
		
	}

}

