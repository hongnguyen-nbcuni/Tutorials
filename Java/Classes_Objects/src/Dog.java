
public class Dog {

	// Instance Variables (states/attributes)
	String name;
	String breed;
	int age;
	String color;
	protected static int count = 1;
	
	// Constructor Declaration of Class
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.count += 1;		// this.count or Dog.count would work
		Dog.count += 1;
		Dog.display();          // since we have "static void display()"
		//Dog.display2();		// this wouldn't work, we need an instance to call display2()
		this.display2();
	}
	
	public static void display() {
		System.out.println("I'm a dog - static!");
	}
	
	public void display2() {
		System.out.println("I'm a dog - non static");
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	

	@Override
	public String toString()
	{
		return ("Hi my name is " + this.getName() +  
		          ".\nMy breed, age and color are " + this.getBreed()  
		           + ", " + this.getAge() + ", " + this.getColor()); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
		System.out.println(tuffy.toString());

	}

}
