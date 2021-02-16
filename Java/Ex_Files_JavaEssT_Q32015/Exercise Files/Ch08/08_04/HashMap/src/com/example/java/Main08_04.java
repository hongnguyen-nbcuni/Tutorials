package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main08_04 {


	public static void main(String[] args) {
		
		// hash map to represent an unordered data collection
		// implementation of the interface named map
		
		Map<String, String> map = new HashMap<>(); // key and value
		
		map.put("California",  "Sacramento");
		map.put("Oregon",  "Salem");
		map.put("Washington",  "Olympia");
		System.out.println(map);
		
		map.put("Alaska",  "Juneau");
		System.out.println(map);
		
		String cap = map.get("Oregon");
		System.out.println(cap);		// Salem
		
		
	


	}

}


