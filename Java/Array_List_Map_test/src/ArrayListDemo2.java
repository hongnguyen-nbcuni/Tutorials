import java.util.ArrayList;

public class ArrayListDemo2 {


	public static void main(String args[]) {

		// create an empty array list
		ArrayList<StringBuilder> arrlist1 = new ArrayList<StringBuilder>();

		// use add for new value
		arrlist1.add(new StringBuilder("Learning-"));

		System.out.println("String: " + arrlist1);					// [Learning-]
		System.out.println("String: " + arrlist1.get(0));			// Learning-

		// using clone to affect the objects pointed to by the references.
		ArrayList<StringBuilder> arrlist2 =  (ArrayList) arrlist1.clone(); // // point to arrList1

		// appending the string
		StringBuilder strbuilder = arrlist1.get(0);  // // point to arrList1

		System.out.println("strbuilder: " + strbuilder);		// Learning-

		System.out.print("Array 1: ");

		for (int i = 0; i < arrlist1.size(); i++) {
			System.out.print(arrlist1.get(i) + " ");
		}


		System.out.print("\nArray 2: ");

		for (int i = 0; i < arrlist2.size(); i++) {
			System.out.print(arrlist2.get(i) + " ");
		}

		arrlist1.add(new StringBuilder("Learning-1.2"));


		System.out.print("\nArray 1: ");

		for (int i = 0; i < arrlist1.size(); i++) {
			System.out.print(arrlist1.get(i) + " ");
		}

		strbuilder.append(" list1, list2-both pointing to the same StringBuilder");

		arrlist1.add(new StringBuilder("Learning-1.3"));

		arrlist2.add(new StringBuilder("Learning-2.2"));


		System.out.println();

		System.out.println("strbuilder: " + strbuilder);

		strbuilder.append(" appending string2");


		System.out.println("The 1st list prints: ");

		// both lists will print the same value, printing list1
		for (int i = 0; i < arrlist1.size(); i++) {
			System.out.println(arrlist1.get(i) + " ");
		}

		// retrieves element at 2th position
		StringBuilder string = arrlist1.get(2);
		System.out.println("Retrieved element is = " + string);	   

		System.out.println("\nThe 2nd list prints: ");

		// both lists will print the same value (by cloning it from arrlist1), printing list2 
		for (int i = 0; i < arrlist2.size(); i++) {
			System.out.println(arrlist2.get(i) + " ");
		}

		StringBuilder string2 = new StringBuilder("Learning-2.2");
		

		int retval = arrlist1.size();
		System.out.println("\nList 1 consists of "+ retval +" elements");

		retval = arrlist2.size();
		System.out.println("List 2 consists of "+ retval +" elements");


	}


}
