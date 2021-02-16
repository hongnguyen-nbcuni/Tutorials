import java.awt.*;	// abstract window toolkit library

public class Car {

    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2" or "Hello World"
    // Color -> from awt library
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    
    public Car(double d, String licensePlate,Color paintColor,boolean areTailingWorking) {
    	
    	this.averageMilesPerGallon = d;
    	this.licensePlate = licensePlate;
    	this.paintColor = paintColor;
    	this.areTailingWorking = areTailingWorking;
    	
    }
    
    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    
}
