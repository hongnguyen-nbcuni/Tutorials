package JsonProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		// load json file, use FileReader
		FileReader reader = new FileReader("./jsonfiles/employee.json");
		// return java object
		Object obj = jsonParser.parse(reader);
		// convert java to json object
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname = (String) empjsonobj.get("firstName");
		String lname = (String) empjsonobj.get("lastName");
		System.out.println("First name: " + fname);
		System.out.println("Last Name: " + lname);
		
		// now abstract json address array
		JSONArray array = (JSONArray) empjsonobj.get("address");
		
		for(int i=0; i < array.size(); i++) {
			// extract json object
			JSONObject address = (JSONObject) array.get(i);
			
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
			System.out.println(" Address of " + i + " is .......... ");
			System.out.println(" Street: " + street);
			System.out.println(" City: " + city);
			System.out.println(" State: " + state);
			
		}
		
	}

}
