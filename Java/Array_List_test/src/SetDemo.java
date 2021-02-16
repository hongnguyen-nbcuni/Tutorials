import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set is an unordered collection of objects 
// in which duplicate values cannot be stored

// LinkedHashSet class which is implemented 
// in the collections framework is an ordered version of HashSet 
// that maintains a doubly-linked List across all elements

// TreeSet behaves like simple set with the exception that 
// it stores elements in sorted format.

public class SetDemo {

	public static void main(String[] args) {
		// Set demonstration using HashSet 
		Set<String> hash_Set 
		= new HashSet<String>(); 

		hash_Set.add("Geeks"); 
		hash_Set.add("For"); 
		hash_Set.add("Geeks"); 	// ignore duplicate
		hash_Set.add("Example"); 
		hash_Set.add("Set"); 

		System.out.println(hash_Set); // [Set, Example, Geeks, For]

		Set<Integer> a = new HashSet<Integer>();  
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 

		Set<Integer> b = new HashSet<Integer>();  
		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  

		// To find union  
		Set<Integer> union = new HashSet<Integer>(a);  
		union.addAll(b);  				// [0, 1, 2, 3, 4, 5, 7, 8, 9]
		System.out.print("Union of the two Set");  
		System.out.println(union);  

		// To find intersection  
		Set<Integer> intersection = new HashSet<Integer>(a);  
		intersection.retainAll(b);  	// [0, 1, 3, 4]
		System.out.print("Intersection of the two Set");  
		System.out.println(intersection);  

		// To find the symmetric difference  
		Set<Integer> difference = new HashSet<Integer>(a);  
		difference.removeAll(b);  		// [2, 8, 9]
		System.out.print("Difference of the two Set");  
		System.out.println(difference);  

		Set<String> hs 
		= new HashSet<String>(); 

		// Elements are added using add() method 
		hs.add("B"); 
		hs.add("B"); 			// ignore duplicate
		hs.add("C"); 
		hs.add("A"); 

		System.out.println(hs); 		// [A, B, C]

		hs.remove("B");

		// Iterating though the Set 
		for (String value : hs) {
			System.out.print(value 
					+ ", ");
		} // A, C, 
		System.out.println(); 


		Set<String> hs2 
		= new HashSet<String>(); 

		// Elements are added using add() method 
		hs2.add("A"); 
		hs2.add("B"); 
		hs2.add("C"); 
		hs2.add("A"); 

		System.out.println("Set is " + hs2);  	// [A, B, C]

		String check = "D"; 

		// Check if the above string exists in 
		// the SortedSet or not 
		System.out.println("Contains " + check 
				+ " " + hs2.contains(check)); 	// false


		Set<String> h = new HashSet<String>(); 

		// Adding elements into the HashSet 
		// using add() 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 

		// Adding the duplicate 
		// element 
		h.add("India"); 

		System.out.println("\nHashSet: ");
		// Displaying the HashSet 
		System.out.println(h); 

		// Removing items from HashSet 
		// using remove() 
		h.remove("Australia"); 
		System.out.println("Set after removing "
				+ "Australia:" + h); 

		// Iterating over hash set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = h.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 

		// LinkedHashSet class which is implemented 
		// in the collections framework is an ordered version of HashSet 
		// that maintains a doubly-linked List across all elements

		Set<String> lh 
		= new LinkedHashSet<String>(); 

		// Adding elements into the LinkedHashSet 
		// using add() 
		lh.add("India"); 
		lh.add("Australia"); 
		lh.add("South Africa"); 

		// Adding the duplicate 
		// element 
		lh.add("India"); 


		// Displaying the LinkedHashSet 
		System.out.print("\nLinkedHashSet: ");
		System.out.println(lh); 		// [India, Australia, South Africa]

		// Removing items from LinkedHashSet 
		// using remove() 
		lh.remove("Australia"); 
		System.out.println("Set after removing "
				+ "Australia:" + lh); 	// [India, South Africa]

		// Iterating over linked hash set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i1 = lh.iterator(); 
		while (i1.hasNext()) 
			System.out.println(i1.next()); 


		Set<String> ts 
		= new TreeSet<String>(); 

		// Adding elements into the TreeSet 
		// using add() 
		ts.add("India"); 
		ts.add("Australia"); 
		ts.add("South Africa"); 

		// Adding the duplicate 
		// element 
		ts.add("India"); 

		System.out.print("\nTreeSet: ");
		
		// Displaying the TreeSet 
		System.out.println(ts); 	// sorted

		// Removing items from TreeSet 
		// using remove() 
		ts.remove("Australia"); 
		System.out.println("Set after removing "
				+ "Australia:" + ts); 

		// Iterating over Tree set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> k = ts.iterator(); 
		while (i.hasNext()) 
			System.out.println(k.next()); 

	}

}
