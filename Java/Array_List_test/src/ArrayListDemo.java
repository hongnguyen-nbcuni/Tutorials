import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// create an empty array list with an initial capacity
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		// use add() method to add elements in the list
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(30);
		arrlist.add(35);

		// adding element 23 at third position
		arrlist.add(2,23);

		// let us print all the elements available in list
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

		// create an empty array list2 with an initial capacity
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

		// use add() method to add elements in list2
		arrlist2.add(25);
		arrlist2.add(30);
		arrlist2.add(31);
		arrlist2.add(35);

		// let us print all the elements available in list2
		System.out.println("Printing list2:");
		for (Integer number : arrlist2) {
			System.out.println("Number = " + number);
		}

		// inserting all elements list2 after list1
		//arrlist.addAll(arrlist2);

		// inserting all elements of list2 at third position
		arrlist.addAll(2, arrlist2);

		System.out.println("Printing all the elements");
		// let us print all the elements available in list1
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

		// retrieving the index of element 15
		int index = arrlist.indexOf(15);
		System.out.println("The element 15 is at index " + index);

		// retrieving the index of element 15
		boolean ret = arrlist.contains(15);
		System.out.println("Found y/n? " + ret);

		// inserting all elements of list2 at third position
		arrlist.addAll(2, arrlist2);

	}

}

