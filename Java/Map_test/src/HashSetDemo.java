import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet is an unordered collection of objects in which duplicate values cannot be stored
		// Set demonstration using HashSet 

		Set<String> hs 
		= new HashSet<String>(); 

		// Elements are added using add() method 
		hs.add("B"); 
		hs.add("B"); 
		hs.add("C"); 
		hs.add("A"); 

		System.out.println(hs);  	// [A, B, C]

		String check = "D"; 		// Contains D false

		// Check if the above string exists in 
		// the SortedSet or not 
		System.out.println("Contains " + check 
				+ " " + hs.contains(check)); 

		// Removing the element b 
		hs.remove("B"); 

		System.out.println("After removing element " + hs);//  [A, C]

		// Iterating though the Set 
		for (String value : hs) 
			System.out.print(value 
					+ ", "); 
		System.out.println(); 


		Set<String> hashset = new HashSet<String>(); 

		hashset.add("Geeks"); 
		hashset.add("For"); 
		hashset.add("Geeks"); 
		hashset.add("Example"); 
		hashset.add("Set"); 
		System.out.println(hashset); // [Set, Example, Geeks, For]


		Set<Integer> a = new HashSet<Integer>();  
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));  
		Set<Integer> b = new HashSet<Integer>();  
		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  

		// To find union  
		Set<Integer> union = new HashSet<Integer>(a);  
		union.addAll(b);  
		System.out.print("Union of the two Set: ");  // [0, 1, 2, 3, 4, 5, 7, 8, 9]
		System.out.println(union);  				

		// To find intersection  
		Set<Integer> intersection = new HashSet<Integer>(a);  
		intersection.retainAll(b);  
		System.out.print("Intersection of the two Set: "); // [0, 1, 3, 4]
		System.out.println(intersection);  

		// To find the symmetric difference  
		Set<Integer> difference = new HashSet<Integer>(a);  
		difference.removeAll(b);  
		System.out.print("Difference of the two Set: ");  // [2, 8, 9]
		System.out.println(difference); 


		Set<String> h = new HashSet<String>(); 

		// Adding elements into the HashSet 
		// using add() 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 

		// Adding the duplicate 
		// element 
		h.add("India"); 

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
	} 


}
