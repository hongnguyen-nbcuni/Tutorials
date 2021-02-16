
public class StudentEx1 {

	public static void main(String[] args) {
		Student joe = new Student("Joe");
		Student bill = new Student("Bill");
		Student john = new Student("John");

		System.out.println(joe.compareTo(bill) > 0);
		
		System.out.println(joe.compareTo(john) > 0);
		
		System.out.println(john);    // called toString();
		
	}

}
