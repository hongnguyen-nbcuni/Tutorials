import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	int rollno;
	String name, address;

	public Student2(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;

	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

}


class Sortbyroll implements Comparator<Student2> {

	// used for sorting in ascending order

	public int compare(Student2 a, Student2 b) {
		return a.rollno - b.rollno;
	}
}

public class ArraySortDemo2 {

	public static void main(String[] args) {

		// 1
		Student2[] arr = {
				new Student2(111, "bbbb", "london"),
				new Student2(131, "aaaa", "nyc"),
				new Student2(121, "cccc", "los angeles")
		};

		System.out.println("Unsorted");
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

		// sort
		Arrays.sort(arr, new Sortbyroll());

		System.out.println("Sorted");

		// Sorted
		//111 bbbb london
		//121 cccc los angeles
		//131 aaaa nyc
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);

		}

		// 2
		ArrayList<Student2> al2 = new ArrayList<Student2>(); 
		al2.add(new Student2(111, "bbbb", "london")); 
		al2.add(new Student2(131, "aaaa", "nyc")); 
		al2.add(new Student2(121, "cccc", "los angeles")); 

		Collections.sort(al2, new Sortbyroll()); 

		// [111 bbbb london, 121 cccc los angeles, 131 aaaa nyc]
		System.out.println("ArrayList collections sort: " + al2);		

		// 111 bbbb london
		// 121 cccc los angeles
		// 131 aaaa nyc
		for (int i=0; i<al2.size(); i++) 
			System.out.println(al2.get(i));

		// 3
		String domains[] = {"one", "two", "three", "four", "five"};
		
		List<String> colList = new ArrayList<String>(Arrays.asList(domains));
		
		Collections.sort(colList);
		
		// [five, four, one, three, two]
		System.out.println("List after the use of Collection.sort: " + colList);
		
	}

}
