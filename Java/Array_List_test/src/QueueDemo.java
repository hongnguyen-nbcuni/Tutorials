import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue; // The elements are stored based on the priority order which is ascending by default.
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
// PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed

// The Queue interface is used to hold the elements about to be processed in 
// FIFO(First In First Out) order. It is an ordered list of objects

// Priority Queue: The elements are stored based on the priority order which is ascending by default.

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q 
		= new LinkedList<>(); 

		// Adds elements {0, 1, 2, 3, 4} to 
		// the queue 
		for (int i = 0; i < 5; i++) 
			q.add(i); 

		// Display contents of the queue. 
		System.out.println("Elements of queue "
				+ q); 								// [0, 1, 2, 3, 4]

		// To remove the head of queue. 
		int removedele = q.remove(); 
		System.out.println("removed element-"
				+ removedele); 

		System.out.println(q); 						// [1, 2, 3, 4]

		// To view the head of queue 
		int head = q.peek(); 
		System.out.println("head of queue-"
				+ head); 							// head of queue-1

		// Rest all methods of collection 
		// interface like size and contains 
		// can be used with this 
		// implementation. 
		int size = q.size(); 
		System.out.println("Size of queue-"
				+ size); 							// Size of queue-4


		// the priority order which is ascending by default.
		Queue<String> pq = new PriorityQueue<>(); 

		pq.add("Geeks"); 
		pq.add("For"); 
		pq.add("Geeks"); 

		System.out.println(pq); 					// [For, Geeks, Geeks]

		System.out.println("Initial Queue " + pq); // [For, Geeks, Geeks]

		pq.remove("Geeks"); 						

		System.out.println("After Remove " + pq); 	// [For, Geeks]

		//  poll() method is also used to remove the head and return it.
		System.out.println("Poll Method " + pq.poll()); // For

		System.out.println("Final Queue " + pq); 	// [Geeks]

		pq.add("For"); 
		pq.add("Geeks2"); 

		Iterator iterator = pq.iterator(); 

		while (iterator.hasNext()) { 
			System.out.print(iterator.next() + " "); 
		} 

		System.out.println();

		// Creating empty priority queue 
		Queue<Integer> pQueue 
		= new PriorityQueue<Integer>(); 

		// Adding items to the pQueue 
		// using add() 
		pQueue.add(10); 
		pQueue.add(20); 
		pQueue.add(15); 

		System.out.println("qQueue: " + pQueue); // [10, 20, 15]

		// Printing the top element of 
		// the PriorityQueue 
		System.out.println("Peek: " + pQueue.peek()); 	// 10

		// Printing the top element and removing it 
		// from the PriorityQueue container 
		System.out.println("Poll: " + pQueue.poll()); 	// 10

		// Printing the top element again 
		System.out.println("Peek: " + pQueue.peek());  // 15


		// Creating empty LinkedList 
		Queue<Integer> ll 
		= new LinkedList<Integer>(); 

		// Adding items to the ll 
		// using add() 
		ll.add(10); 
		ll.add(20); 
		ll.add(15); 

		System.out.println("Queue: " + ll);	// [10, 20, 15]

		// Printing the top element of 
		// the LinkedList 
		System.out.println(ll.peek()); 		// 10

		// Printing the top element and removing it 
		// from the LinkedList container 
		System.out.println(ll.poll()); 		// 10

		// Printing the top element again 
		System.out.println(ll.peek()); 		// 20

		// Creating empty priority 
		// blocking queue 
		Queue<Integer> pbq 
		= new PriorityBlockingQueue<Integer>(); 

		// Adding items to the pbq 
		// using add() 
		pbq.add(10); 
		pbq.add(20); 
		pbq.add(15); 

		// Printing the top element of 
		// the PriorityBlockingQueue 
		System.out.println(pbq.peek());  // 10

		// Printing the top element and 
		// removing it from the 
		// PriorityBlockingQueue 
		System.out.println(pbq.poll());  // 10

		// Printing the top element again 
		System.out.println(pbq.peek());   // 15



	} 

}

