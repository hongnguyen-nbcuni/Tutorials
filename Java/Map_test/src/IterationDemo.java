import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationDemo {

	public static void main(String[] args) {
		
		Map<String,String> m1 = new HashMap<String,String>();
		
		m1.put("1", "one");
		m1.put("2", "two");
		m1.put("3", "three");
		m1.put("4", "four");
		m1.put("5", "five");
		
		// 1
		// using keySet() for iteration over keys
		for (String key: m1.keySet()) {		
			System.out.print("Key: " + key + ", ");
            String value = m1.get(key); 
            System.out.println("Value: " + value);
            // Key: 1, Value: one
		}
		
		System.out.println("Map: " + m1); // {1=one, 2=two, 3=three, 4=four, 5=five}
		
		// using values() for iteration over keys
		for (String v: m1.values()) 
			System.out.print("Value: " + v + ", ");
		// Value: one, Value: two, Value: three, Value: four, Value: five, 
		
		System.out.println();
		
		// 2
		// using iterators, Map.Entry
		Iterator<Map.Entry<String,String>> itr = m1.entrySet().iterator();	
		while(itr.hasNext()) {
			Map.Entry<String,String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
		}
		
		System.out.println("Similar way: ");
		
		Iterator<String> itr2 = m1.keySet().iterator();
		while(itr2.hasNext()) {
			String nextKey = itr2.next();
			System.out.print(nextKey + " ");
			System.out.println(m1.get(nextKey));
			
		}
		
		
		// 3
		// using forEach
		m1.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
		
		
		
		
	}

}
