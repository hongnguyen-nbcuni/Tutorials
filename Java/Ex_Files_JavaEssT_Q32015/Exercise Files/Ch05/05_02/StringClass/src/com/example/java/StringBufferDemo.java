package com.example.java;

// StringBuffer is a peer class of String that provides much of the functionality of strings. 
// String represents fixed-length, immutable character sequences 
// while StringBuffer represents growable and writable character sequences.
// StringBuffer may have characters and substrings inserted in the middle or appended to the end. 
// It will automatically grow to make room for such additions and 
// often has more characters preallocated than are actually needed, to allow room for growth.

// StringBuffer( ): It reserves room for 16 characters without reallocation.

// append( ): It is used to add text at the end of the existence text
// insert( ): It is used to insert text at the specified index position
// reverse( ): It can reverse the characters within a StringBuffer object
// delete( ) :  from start Index to endIndex–1
// and deleteCharAt( ): deletes the character at the index specified by location
// replace() : the substring at start Index through endIndex–1 is replaced


public class StringBufferDemo {

	public static void main(String[] args) { 

		StringBuffer s = new StringBuffer("GeeksforGeeks"); 
		int p = s.length(); 
		int q = s.capacity(); 
		System.out.println("Length of string GeeksforGeeks=" + p); // 13
		System.out.println("Capacity of string GeeksforGeeks=" + q); // 29

		s.append("Geeks"); 
		System.out.println(s); 	// GeeksforGeeksGeeks
		s.append(1); 
		System.out.println(s); 	// GeeksforGeeksGeeks1

		StringBuffer s2 = new StringBuffer("GeeksGeeks"); 
		s2.insert(5, "for"); 
		System.out.println(s2); // returns GeeksforGeeks 

		s.insert(0, 5); 
		System.out.println(s2); // returns 5GeeksforGeeks 

		s2.insert(3, true); 
		System.out.println(s); // returns 5GetrueeksforGeeks 

		s2.insert(5, 41.35d); 
		System.out.println(s); // returns 5Getr41.35ueeksforGeeks 

		s2.insert(8, 41.35f); 
		System.out.println(s); // returns 5Getr41.41.3535ueeksforGeeks 

		char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' }; 

		// insert character array at offset 9 
		s2.insert(2, geeks_arr); 
		System.out.println(s); // returns 5Gpawanetr41.41.3535ueeksforGeeks 

		StringBuffer s3 = new StringBuffer("GeeksforGeeks"); 
		// from start Index to endIndex–1
        s3.delete(0, 5); 
        System.out.println(s3); // returns forGeeks 
        s3.deleteCharAt(7); 
        System.out.println(s3); // returns forGeek 
        
        StringBuffer s4 = new StringBuffer("GeeksforGeeks"); 
        // start Index through endIndex–1
        s4.replace(5, 8, "are"); 
        System.out.println(s4); // returns GeeksareGeeks 
        
        StringBuffer s5 = new StringBuffer("GeeksforGeeks");
        System.out.println(s5.substring(5));		// forGeeks
        
        StringBuffer s6 = new StringBuffer("GeeksforGeeks");
        System.out.println(s6.substring(5,10));		// 5 to 9: forGe
        
        

	}

}
