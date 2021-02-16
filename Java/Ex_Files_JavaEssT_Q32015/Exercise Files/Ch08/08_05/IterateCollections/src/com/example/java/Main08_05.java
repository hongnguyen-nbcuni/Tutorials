package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main08_05 {


	    public static void main(String[] args) {

	        System.out.println("Ordered data");
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("California");
	        list.add("Oregon");
	        list.add("Washington");

	        System.out.println("toString() output");
	        System.out.println(list);
	        System.out.println("");

	        System.out.println("ArrayList iterator");
	        System.out.println("");
	        
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	        	String value = iterator.next();
	        	System.out.println(value);
	        }

	        System.out.println("ArrayList ForEach");
	        System.out.println("");
	        for (String value: list) {
	        	System.out.println(value);
	        }

	        System.out.println("Java 8 method reference");
	        System.out.println("");
	        list.forEach(System.out::println); // print strings
	        
	        System.out.println("Unordered data");
	        HashMap<String, String> map = new HashMap<String, String>();
	        map.put("California", "Sacramento");
	        map.put("Oregon", "Salem");
	        map.put("Washington", "Olympia");
	        System.out.println(map);
	        System.out.println("");

	        System.out.println("HashMap Iterator");
	        Set<String> keys = map.keySet();
	        Iterator<String> iterator1 = keys.iterator();
	        while (iterator1.hasNext()) {
	        	String key = iterator1.next();
	        	System.out.println("The capitor of " + key + " is " + map.get(key));
	        }
	        System.out.println("");

	        System.out.println("HashMap ForEach");
	        for (String key : keys) {
	        	System.out.println("The capitor of " + key + " is " + map.get(key));
	        }
	        System.out.println("");

	    }

	}
