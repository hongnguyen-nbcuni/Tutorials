import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// initializing unsorted byte array
		byte byteArr[] = {10,20,15,22,35};

		// sorting array
		Arrays.sort(byteArr);

		// let us print all the elements available in list
		System.out.println("The sorted byte array is:");
		for (byte number : byteArr) {
			System.out.println("Number = " + number);
		}

		// entering the value to be searched
		byte searchVal = 35;

		int retVal = Arrays.binarySearch(byteArr,searchVal);

		System.out.println("The index of element 35 is : " + retVal);


		// intializing an array arr1
		boolean[] arr1 = new boolean[] {true, false};

		// printing the array
		System.out.println("Printing 1st Boolean array:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);  
		}
			
		System.out.println("The string representation of array is:");
		System.out.println(Arrays.toString(arr1)); 

		// copying array arr1 to arr2 with newlength as 4
		boolean[] arr2 = Arrays.copyOf(arr1, 4);
		arr2[2] = false;
		arr2[3] = true;

		// printing the array arr2
		System.out.println("Printing new Boolean array:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		// initializing three boolean arrays
		boolean[] arrone = new boolean[] { true, false, true };
		boolean[] arrtwo = new boolean[] { false, true, true };
		boolean[] arrthree = new boolean[] { true, false, true };

		// comparing arr1 and arr2
		boolean cmp = Arrays.equals(arrone, arrtwo);
		System.out.println("arr1 and arr2 equal: " + cmp);

		// comparing arr1 and arr3
		cmp = Arrays.equals(arrone, arrthree);
		System.out.println("arr1 and arr3 equal: " + cmp);
; 


	}

}
