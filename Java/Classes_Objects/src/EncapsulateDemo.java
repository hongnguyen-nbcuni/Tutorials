class Encapsulate 
{ 
	// private variables declared  
	// these can only be accessed by public methods of class 
	private String name; 
	private int roll; 
	private int age; 

	// get method for age to access  
	// private variable age 
	public int getAge()  
	{ 
		return age; 
	} 

	// get method for name to access  
	// private variable name 
	public String getName()  
	{ 
		return name; 
	} 

	// get method for roll to access  
	// private variable roll 
	public int getRoll()  
	{ 
		return roll; 
	} 

	// set method for age to access  
	// private variable age 
	public void setAge( int newAge) 
	{ 
		age = newAge; 
	} 

	// set method for name to access  
	// private variable name 
	public void setName(String newName) 
	{ 
		name = newName; 
	} 

	// set method for roll to access  
	// private variable geekRoll 
	public void setRoll( int newRoll)  
	{ 
		roll = newRoll; 
	} 
}


public class EncapsulateDemo {  

	public static void main (String[] args)  
	{ 
		Encapsulate obj = new Encapsulate(); 

		// setting values of the variables  
		obj.setName("Harsh"); 
		obj.setAge(19); 
		obj.setRoll(51); 

		// Displaying values of the variables 
		System.out.println("Name: " + obj.getName()); 
		System.out.println("Age: " + obj.getAge()); 
		System.out.println("Roll: " + obj.getRoll()); 

		// Direct access is not possible 
		// due to encapsulation 
		// System.out.println("Geek's roll: " + obj.name);         
	} 
} 


