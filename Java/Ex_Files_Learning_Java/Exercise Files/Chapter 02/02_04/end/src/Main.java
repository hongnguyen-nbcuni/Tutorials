import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	/*
        String userInput = "entertainment";      
        String uppercased = userInput.toUpperCase();
            
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: " +
                userInput.contains("Enter".toLowerCase()));

        System.out.println("Contains: " +
                userInput.contains("Enter".toUpperCase()));
        
        // scanner input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userNumber: ");
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        System.out.println("Enter userNumber2: ");
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);
        sc.close();
        
        // array
        int[] numbers = new int[5]; // array of 5 numbers
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;
        
        int[] numbers2 = {31, 45, 22, 98, 10};
        
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        
        String[] myFavoriteCandyBars = {"Twix", "Hersey's", "Crunch"};
        
        System.out.println("length of myFavoriteCandyBars: " + myFavoriteCandyBars.length);
        
        System.out.println(Array.get(myFavoriteCandyBars, 2));
        
        */
    	String s = "dog";
    	String replacedF = s.replace('d', 'f');	// fog
    	System.out.println(replacedF);
    	
        double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);
    	
    	Random rand = new Random();
    	
    	int randomNumber = rand.nextInt();
    	System.out.println(randomNumber);
    	int randomNumberWithBound = rand.nextInt(10);
    	System.out.println(randomNumberWithBound);
    	
    	
    }
}
