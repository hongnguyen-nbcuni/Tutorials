
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
		System.out.println("Enter an integer: ");	
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a String: ");
		String b = br.readLine();
		
		System.out.printf("You have entered:- " + a +
				" and name as " + b);

	}

}
