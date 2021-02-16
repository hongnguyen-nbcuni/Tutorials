package Utilities;

import java.util.Scanner;

public class InputHelper {

	
	static Scanner input;
	
	public static String getInput(String prompt) {
		System.out.print(prompt);
	    input = new Scanner(System.in);
	    
	    String userInput = null;
        	
	    // method Returns true if this scanner has another token in its input.
	    while(input.hasNext())		
	    {
	    	// the next element in the iteration.
	    	userInput = input.nextLine();
	    	System.out.println("Input: " + userInput);
	    	
	    	 switch(userInput) {
	            case "Kodak Tri-X":
	            	
	            	if (userInput.equals("Kodak")) {
	            		System.out.println("Correct!");
	            	}
	            	userInput = "Kodak Tri-X";
	            	break;
	            case "Ilford HP5":
	            	userInput = "Ilford HP5";
	            	break;
	      	
	            case "Rodinal":
	            	userInput = "Rodinal";
	            	break;
	       	
	            case "Ilford DD-X":
	            	userInput = "Ilford DD-X";
	            	break;
	        
	            case "400":
	            	userInput = "400";
	            	break;
	            case "800":
	            	userInput = "800";
	            	break;
	            case "1600":
	            	userInput = "1600";
	            	break;	
	            	
	            default:
	            	userInput = "Wrong input";
	            	System.out.print(prompt);
	            	break;
	        }   
	    	
	    	 if (!userInput.equals("Wrong input")) {
	    		 break;		// break out the loop
	    	 }
	          
	    }
	        
	    return userInput;
	    
	  }
	

	public static void closeScanner() {
		// TODO Auto-generated method stub
		input.close();	
		System.out.println("Scanner closed");
		
	}
	


}
