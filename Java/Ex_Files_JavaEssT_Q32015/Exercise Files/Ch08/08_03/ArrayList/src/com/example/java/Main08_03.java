package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main08_03 {

    public static void main(String[] args) {
    	
    	// list to represent an ordered data collection
		// implementation of the interface named List
    	
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals); // [Lion, Tiger, Cat, Dog]

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals); // [Lion, Tiger, Elephant, Cat, Dog]
          
        animals.remove(0);
        System.out.println(animals);  // [Tiger, Elephant, Cat, Dog]
        
        String one_animal = animals.get(1); 
        System.out.println(one_animal);  // Elephant
        
        int pos = animals.indexOf("Dog");
        System.out.println(pos); // 3
    }
}

