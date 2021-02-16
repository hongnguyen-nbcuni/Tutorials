import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo {

	public static void main(String[] args) {
		
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

		Arrays.sort(arr, 1, 5);
		
		// [13, 6, 7, 21, 45, 9, 2, 100]
		System.out.println("Sorted a sub array : " + Arrays.toString(arr)); 
		
		Arrays.sort(arr);
		
		// [2, 6, 7, 9, 13, 21, 45, 100]
		System.out.println("Sorted a whole array: " + Arrays.toString(arr)); 
		
		Integer[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
		
	
		Arrays.sort(arr2, Collections.reverseOrder());
		
		// [100, 45, 21, 13, 9, 7, 6, 2]
		System.out.println(Arrays.toString(arr2));
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		
		// ascending order
		Collections.sort(al);
		
		// [five, four, one, three, two]
		System.out.println("ArrayList collections sort: " + al);
		
	}	

}
