package exercises;

import java.util.ArrayList;
import java.util.List;

public class Unitednations {

	public static void main(String[] args) {
		//new Country().dance();
		//new Ireland().dance();
		//new Brazil().dance();
		
		Ireland eire = new Ireland();
		Brazil brazil = new Brazil();
	
		
		List<Country> countries = new ArrayList<>();
		countries.add(eire); 		// since its class is extended to Country class
		countries.add(brazil);
		
		for (Country country2 : countries) {
			country2.dance();		// jig and samba
		}
	}

}
