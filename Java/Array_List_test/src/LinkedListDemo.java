import java.util.LinkedList;

// LinkedList data structure which is a linear data structure
public class LinkedListDemo {

	public static void main(String[] args) {
		// Creating object of the 
		// class linked list 
		LinkedList<String> ll 
		= new LinkedList<String>(); 

		// Adding elements to the linked list 
		ll.add("A"); 
		ll.add("B"); 
		ll.addLast("C"); 
		ll.addFirst("D"); 
		ll.add(2, "E"); 

		System.out.println(ll); 			// [D, A, E, B, C]


		// Using the Get method and the  
		// for loop  
		for (int i = 0; i < ll.size(); i++) {  

			System.out.print(ll.get(i) + " ");  // D A E B C 
		}  

		System.out.println();

		LinkedList<String> ll2 = new LinkedList<>();  

		ll2.add("Geeks");  
		ll2.add("Geeks");  
		ll2.add(1, "Geeks");  

		System.out.println("Initial LinkedList " + ll2);  // [Geeks, Geeks, Geeks]

		ll2.set(1, "For");  

		ll2.remove("Geeks");  

		System.out.println("Updated LinkedList " + ll2); // [For, Geeks]


	}

}
