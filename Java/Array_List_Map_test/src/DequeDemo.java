import java.util.ArrayDeque; 
import java.util.Deque;		
import java.util.Iterator;
import java.util.LinkedList;

// The Deque is related to the double-ended queue that supports addition 
// or removal of elements from either end of the data structure
// It can either be used as a queue(first-in-first-out/FIFO) or 
// as a stack(last-in-first-out/LIFO)

// ArrayDeque: resizable-array  
// likely to be faster than Stack when used as a stack.
// ArrayDeque class is likely to be faster than LinkedList when used as a queue.


public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> deque 
		= new LinkedList<String>(); 

		// We can add elements to the queue 
		// in various ways 

		// Add at the last 
		deque.add("Element 1 (Tail)"); 

		// Add at the first 
		deque.addFirst("Element 2 (Head)"); 

		// Add at the last 
		deque.addLast("Element 3 (Tail)"); 

		// Add at the first 
		deque.push("Element 4 (Head)"); 

		// Add at the last 
		deque.offer("Element 5 (Tail)"); 

		// Add at the first 
		deque.offerFirst("Element 6 (Head)"); 

		System.out.println(deque + "\n"); 

		// We can remove the first element 
		// or the last element. 
		deque.removeFirst(); 
		deque.removeLast(); 
		System.out.println("Deque after removing "
				+ "first and last: "
				+ deque); 

		// Initializing an deque 
		Deque<String> dq 
		= new ArrayDeque<String>(); 

		// add() method to insert 
		dq.add("For"); 
		dq.addFirst("Geeks1"); 
		dq.addLast("Geeks2"); 

		System.out.println(dq); 	// [Geeks1, For, Geeks2]

		// Printing the top element and 
		// Remove it from the list
		System.out.println(dq.pop()); 		// Greeks1

		// Printing the top element and 
		// removing it from the 
		System.out.println(dq.poll()); 		// For

		System.out.println(dq.pollFirst()); // Greeks2

		// pop will throw NoSuchElementException() on empty list, 
		// whereas poll returns null.
		System.out.println(dq.pollLast());	// null

		
		// Initializing an deque 
        Deque<String> dq2
            = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq2.add("For"); 
        dq2.addFirst("Geeks"); 
        dq2.addLast("Geeks2"); 
        dq2.add("is so good"); 
  
        // from the first.
        // Geeks For Geeks2 is so good 
        for (Iterator itr = dq2.iterator(); 
             itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
  
        System.out.println(); 
  
        // from the back.
        // is so good Geeks2 For Geeks
        for (Iterator itr = dq2.descendingIterator(); 
             itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
        
        dq2.clear(); 
        
        System.out.println(dq2);	// []

	} 


}


