import java.util.Arrays;

public class SortArrayEx1 {

	public static void main(String[] args) {
		int[] x = {-99,5,6,3,2,1,7,8,0};
		
		Arrays.sort(x, 1, 7);    // sort from index 1 up to index 6
		
		for (int i: x) {
			System.out.println(i + ",");
		}

	}

}
