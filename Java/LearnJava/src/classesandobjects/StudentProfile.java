package classesandobjects;

public class StudentProfile {
	// 1st - we add our attributes - each will have a data type
	String firstName;
	String lastName;
	String declaredMajor;
	double gpa;
	int expectedYearToGraduate;
	
	// 3rd, moving on to the constructor
	// we'll write public, the name of the class
	// we'll add our parameters, each should match back to the attributes
	// 4th, we go to our main class
	
	public StudentProfile (String firstName, String lastName, String declareMajor,
			double gpa, int expectedYearToGraduate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.declaredMajor = declareMajor;
		this.gpa = gpa;
		this.expectedYearToGraduate = expectedYearToGraduate;
		
	}
	
	// 2nd, we add our behavior or instance methods
	public void incrementExpectedGraduationYear() {
		this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
	}
	
	public static void main(String[] args) {
		// named arguments
		
		//StudentProfile profileThree = new StudentProfile(firstName:"Sally", lastName:"Salmon", 
		//		declaredMajor:"Film", gpa:3.75, expectedYearToGraduate:2022);
		
		StudentProfile profileOne = new StudentProfile("Sally","Salmon", 
				"Film", 3.75, 2022);
		StudentProfile profileTwo = new StudentProfile("Max","Tiffen", 
				"Computer Science", 3.45, 2021);
		
		profileOne.incrementExpectedGraduationYear();
		System.out.println(profileOne.expectedYearToGraduate);
		
		profileTwo.incrementExpectedGraduationYear();
		System.out.println(profileTwo.expectedYearToGraduate);
		
	}
	

}
