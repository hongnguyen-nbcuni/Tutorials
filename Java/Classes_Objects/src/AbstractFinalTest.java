// Java program to illustrate 
// use of final with inheritance 
  
// base class 
abstract class Shape 
{ 
    private double width; 
      
    private double height; 
      
    // Shape class parameterized constructor 
    public Shape(double width, double height) 
    { 
        this.width = width; 
        this.height = height; 
    } 
      
    // getWidth method is declared as final 
    // so any class extending  
    // Shape cann't override it  
    public final double getWidth() 
    { 
        return width; 
    } 
      
    // getHeight method is declared as final 
    // so any class extending Shape  
    // can not override it  
    public final double getHeight()  
    { 
        return height; 
    } 
  
  
    // method getArea() declared abstract because 
    // it upon its subclasses to provide  
    // complete implementation  
    abstract double getArea(); 
}


// derived class one 
class Rectangle extends Shape 
{ 
    // Rectangle class parameterized constructor 
    public Rectangle(double width, double height) 
    { 
        // calling Shape class constructor 
        super(width, height); 
    } 
    // getArea method is overridden and declared  
    // as final    so any class extending  
    // Rectangle cann't override it 
    @Override
    final double getArea()  
    { 
        return this.getHeight() * this.getWidth(); 
    } 
      
} 
  
//derived class two 
class Square extends Shape 
{ 
    // Square class parameterized constructor 
    public Square(double side) 
    { 
        // calling Shape class constructor 
        super(side, side); 
    } 
  
    // getArea method is overridden and declared as  
    // final so any class extending 
    // Square cann't override it 
    @Override
    final double getArea()  
    { 
        return this.getHeight() * this.getWidth(); 
    } 
      
} 
  
// Driver class  
public class AbstractFinalTest 
{ 
    public static void main(String[] args) 
    { 
        // creating Rectangle object 
        Shape s1 = new Rectangle(10, 20); 
          
        // creating Square object 
        Shape s2 = new Square(10); 
          
        // getting width and height of s1 
        System.out.println("width of s1 : "+ s1.getWidth()); 			// width of s1 : 10.0
        System.out.println("height of s1 : "+ s1.getHeight()); 			// height of s1 : 20.0
          
        // getting width and height of s2 
        System.out.println("width of s2 : "+ s2.getWidth()); 			// height of s1 : 20.0
        System.out.println("height of s2 : "+ s2.getHeight()); 			// width of s2 : 10.0
          
        //getting area of s1 
        System.out.println("area of s1 : "+ s1.getArea()); 				// area of s1 : 200.0
          
        //getting area of s2 
        System.out.println("area of s2 : "+ s2.getArea()); 				// area of s2 : 100.0
          
    } 
}


