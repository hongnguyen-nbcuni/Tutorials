

import Utilities.InputHelper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
        
        // Input/Print
        String type = InputHelper.getInput("Choose a film to develop - Kodak Tri-X or Ilford HP5: ");
        System.out.println("You entered: " + type);
        String iso = InputHelper.getInput("Choose film ISO/ASA - 400, 800 or 1600: ");
        System.out.println("You entered: " + iso);
        String developer = InputHelper.getInput("Choose a film developer chemical - Rodinal or Ilford DD-X: ");
        System.out.println("You entered: " + developer);
        
        InputHelper.closeScanner();
        
        
        //Film selectedFilm = new Film(type, iso, developer);

      
        

	}

}
