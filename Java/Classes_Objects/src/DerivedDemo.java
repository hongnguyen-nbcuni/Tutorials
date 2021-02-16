
// base class
class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed -= increment;
	}
	
	// toString() to print info of Bicycle
	public String toString() {
		return ("No of gears are " + gear + ", speed of bicyle is " + speed);
	}
	
}


class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
    @Override
    public String toString() 
    { 
        return (super.toString() + 
                "\nseat height is " + seatHeight); 
    } 
    
}

public class DerivedDemo {
	
	public static void main(String args[]) {
		
		MountainBike mbike = new MountainBike(3, 100, 25);
		System.out.println(mbike.toString());
		// No of gears are 3, speed of bicyle is 100
		// seat height is 25
		
	}
}
