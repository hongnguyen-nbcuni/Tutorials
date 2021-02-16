
interface Vehicle { 

	// all are the abstract methods. 
	void changeGear(int a); 
	void speedUp(int a); 
	void applyBrakes(int a); 
} 


class Bicycle2 implements Vehicle { 

	int speed;
	int gear;

	// to change gear
	// to change gear 
	@Override
	public void changeGear(int newGear) { 

		gear = newGear; 
	} 

	// to increase speed 
	@Override
	public void speedUp(int increment){ 

		speed = speed + increment; 
	}

	// to decrease speed 
	@Override
	public void applyBrakes(int decrement){ 

		speed = speed - decrement; 
	} 

	public void printStates() { 
		System.out.println("speed: " + speed 
				+ " gear: " + gear); 
	} 

}

class Bike implements Vehicle {
	int speed;
	int gear;
	
	 // to change gear 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    }
    
	 // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
             + " gear: " + gear); 
    } 
      
} 

	

public class InterfaceDemo2 {

	public static void main(String[] args) {

		// creating an instance of Bicycle
		Bicycle2 bicycle = new Bicycle2();
		bicycle.changeGear(2);
		bicycle.speedUp(4);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle present state :"); 
        bicycle.printStates(); 								// speed: 3 gear: 2
        
        // creating instance of the bike. 
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
          
        System.out.println("Bike present state :"); 
        bike.printStates();									// speed: 1 gear: 1
        
		
	}

}
