package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListTest {
	
	private final int INITIAL_CAPACITY = 5;
	
	@Test
	public void shouldDemonstrateArrayList() {
		Collection<String> elements = new ArrayList<>(INITIAL_CAPACITY);
		
		System.out.println(elements.size());      // 0
		
		elements.add("A");
		elements.add("B");
		elements.add("A");
		elements.add("C");
		elements.add("E");
		elements.add("E");     // ArrayList allows duplicate element
		
		System.out.println(elements.size());  	// 6
		
		elements.remove("A");    // it uses the equal method and removes the first "A" from the list
		
		for(String str: elements) {
			System.out.println(str);
		}
		
		System.out.println(elements); // [B, A, C, E, E]
		
	}
	
	
	@Test
	public void shouldDemonstrateArrayList2() {
		List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
		
		System.out.println(elements.size());      // 0
		
		elements.add("A");
		elements.add("B");
		elements.add("A");
		elements.add("C");
		elements.add("E");
		elements.add(0, "T");      // put "T" at index 0
		
		System.out.println(elements.size());  	// 6
		
		elements.remove("A");    // it uses the equal method and removes the first "A" from the list
		
		for(String str: elements) {
			System.out.println(str);
		}
		
		elements.remove(1); 
		
		System.out.println(elements); // [T, A, C, E]
		
		System.out.println(elements.indexOf("A"));  // index of the first "A"
		
		elements.clear();
		
		System.out.println(elements.isEmpty());
		
		System.out.println(elements);
		
	}
	
	
	
	
}
