import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HasMap {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		System.out.println("Size of map is " + map.size());  // 3

		System.out.println(map); // {one=1, two=2, three=3}

		// check if a key is present and if present, print value
		if (map.containsKey("one")) {
			Integer i = map.get("one");
			System.out.println("Value for key " + "\"one\" is: " + i);

		}

		// No need to mention the 
		// Generic type twice 
		HashMap<Integer, String> hm1 = new HashMap<>(); 

		// Initialization of a HashMap 
		// using Generics 
		HashMap<Integer, String> hm2 
		= new HashMap<Integer, String>(); 

		hm1.put(1, "one"); 
		hm1.put(2, "two"); 
		hm1.put(3, "three");

		hm2.put(4, "four"); 
		hm2.put(5, "five"); 
		hm2.put(6, "six"); 

		System.out.println("M1 are: " + hm1);    // {1=one, 2=two, 3=three}
		System.out.println("M2 are: " + hm2);	 // {4=four, 5=five, 6=six}


		// copy all from one map to another map
		Map<Integer, String> hm3 = new HashMap<>();
		
		hm3.putAll(hm1);
		System.out.println("Mappings of hm3 : " + hm3); 
		
		// No need to mention the 
		// Generic type twice 
		Hashtable<Integer, String> ht1 = new Hashtable<>(); // similar to HashMap, but it's synchronized

		// Initialization of a Hashtable 
		// using Generics 
		Hashtable<Integer, String> ht2 
		= new Hashtable<Integer, String>(); 

		// Inserting the Elements 
		// using put() method 
		ht1.put(1, "one"); 
		ht1.put(2, "two"); 
		ht1.put(3, "three"); 

		ht2.put(4, "four"); 
		ht2.put(5, "five"); 
		ht2.put(6, "six"); 

		// Print mappings to the console 
		System.out.println("Mappings of ht1 : " + ht1); 
		System.out.println("Mappings of ht2 : " + ht2); 

		System.out.println("Get value of ht1 : " + ht1.get(1));	// one
		System.out.println("Get value of ht2 : " + ht1.get(2));	// two

		// check to see if the 

	}

}
