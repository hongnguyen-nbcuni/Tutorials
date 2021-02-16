import java.awt.Color;

public class Main02_02 {
	
	public static void main(String[] args) {
		    
		    
		Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);
		Car sallyCar = new Car(13.9, "3D20BN", Color.BLACK, false);
		
		System.out.println("My car's license plate: " + myCar.licensePlate);
		System.out.println("Sally car's license plate: " + sallyCar.licensePlate);
		
		System.out.println(myCar.paintColor.toString());
		
	    myCar.changePaintColor(Color.RED);
	    
	    System.out.println(myCar.paintColor.toString());
		
	}
}

