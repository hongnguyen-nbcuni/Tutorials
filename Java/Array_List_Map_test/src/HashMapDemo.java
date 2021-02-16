import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// The Map interface present in java.util package represents 
		// a mapping between a key and a value. 

		Map<String, Integer> hm 
		= new HashMap<String, Integer>(); 

		hm.put("a", new Integer(100)); 
		hm.put("b", new Integer(200)); 
		hm.put("c", new Integer(300)); 
		hm.put("d", new Integer(400)); 

		// Traversing through the map 
		for (Map.Entry<String, Integer> me : hm.entrySet()) { 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue()); 
		} 

		// Default Initialization of a 
		// Map 
		Map<Integer, String> hm1 = new HashMap<>(); 

		// Initialization of a Map 
		// using Generics 
		Map<Integer, String> hm2 
		= new HashMap<Integer, String>(); 

		// Inserting the Elements 
		hm1.put(1, "Geeks"); 
		hm1.put(2, "For"); 
		hm1.put(3, "Geeks"); 

		hm1.put(new Integer(2), "Greek"); 

		System.out.println("Updated Map " + hm1);  // Updated Map {1=Geeks, 2=Greek, 3=Geeks}


		hm2.put(new Integer(1), "Geeks"); 
		hm2.put(new Integer(2), "For"); 
		hm2.put(new Integer(3), "Geeks"); 

		System.out.println(hm1); // {1=Geeks, 2=For, 3=Geeks}
		System.out.println(hm2); // {1=Geeks, 2=For, 3=Geeks}

		hm2.remove(new Integer(3)); 

		// Final Map 
		System.out.println(hm2);  // {1=Geeks, 2=For}

		// using keySet() for iteration over keys 
		for (Integer num : hm1.keySet())  
			System.out.println("key: " + num); 

		// using values() for iteration over keys 
		for (String name : hm2.values())  
			System.out.println("value: " + name); 


		// using iterators 
		Iterator<Map.Entry<Integer, String>> itr = hm1.entrySet().iterator(); 

		while(itr.hasNext()) 
		{ 
			Map.Entry<Integer, String> entry = itr.next(); 
			System.out.println("Key = " + entry.getKey() +  
					", Value = " + entry.getValue()); 
		} 

        // forEach(action) method to iterate map 
        hm2.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v)); 
        
        

	}

}
