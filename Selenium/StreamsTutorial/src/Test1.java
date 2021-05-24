import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	// count the number of names starting with alphabet A in list
	//@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count=  0;
		for (int i=0; i<names.size(); i++) {
			String actual = names.get(i);

			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

	}


	@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		// there is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate op (filter) returns true
		// we can create stream
		// how to use filter in stream API
		// Lambda -> left side we declare the parameter, the right side we declare the action
		// this is done in 1 single line
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(c);
		
		// another way:
		
		// stream is a collection of strings
		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// print all the names of ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		
		
		
	}
		

	@Test
	public void streamMap() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("man");
		names.add("Don");
		names.add("women");

		// print names of length > 4 with Uppercase
		// map is to help us modify the filter result
		//
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));
		
		// print names which have first letter as with uppercase and sorted
		List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println());
		
		// merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		
		// print
		// newStream.forEach(s->System.out.println(s));
		
		// print sorted order
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
			
	}	
	
	@Test
	public void streamCollect() {
		
		// list
		// new list
		// new list
		// collect the result and converting to the list
		List<String> list = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(list.get(0));
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,3,7);
		// print unique number from this array
		// sort the array
		values.stream().distinct().forEach(s->System.out.println(s));
		
		// after sorted, give 3rd index - 1,2,3,5,7,9
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(li.get(2));
		
		
	}
	
}


