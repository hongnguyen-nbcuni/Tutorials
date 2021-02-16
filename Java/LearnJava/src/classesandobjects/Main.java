package classesandobjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
		
		Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
		
		double triangleArea = triangleA.findArea();
		
		System.out.println("Area of triangleA = " + triangleArea);
		
		System.out.println(Triangle.numOfSide);	
		
	} 

	

}
