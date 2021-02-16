import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class ArrayDequeDemo {

	public static void main(String[] args) {

		// create an empty array deque with an initial capacity
		Deque<Integer> deque = new ArrayDeque<Integer>(5);

		deque.add(1);
		deque.add(2);

		// use addFirst() method to add element at the front of the deque
		deque.addFirst(3);
		deque.addFirst(4);
		deque.addFirst(5);//now, element 20 will be at the front

		// the values will be printed in the same order
		deque.addLast(6);

		// these elements will be added in continuation
		deque.add(7);
		deque.add(8);

		// adding elements using push() method (on top of queue)
		deque.push(9);
		deque.push(10);
		deque.push(11);
		deque.push(12);
		deque.push(13);
		deque.push(14);

		// this will remove element at the first(head) position
		int retval = deque.removeFirst();
		System.out.println("Element removed is: " + retval); // 15


		// print all the elements available in deque
		for (Integer number : deque) {
			System.out.println("Number = " + number);
		}

		// deque does not contain element 15
		boolean retval2 = deque.contains(15);

		if (retval2 == true) {
			System.out.println("element 15 is contained in the deque");
		} else {
			System.out.println("element 15 is not contained in the deque");    
		}

		// it will retrieve element at first(head) position
		int retFirst = deque.element();
		System.out.println("Retrieved First Element is = " + retFirst);

		// finding size of this deque
		retval = deque.size();
		System.out.println("Deque consists of "+ retval +" elements");

		// getFirst() will retrieve element at first(head) position
		int retFirst2 = deque.getFirst();
		System.out.println("Retrieved First Element is = " + retFirst2);

		// getLast() will retrieve element at first(head) position
		int retLast = deque.getLast();
		System.out.println("Retrieved Last Element is = " + retLast);

		if (deque.isEmpty() == true) {
			System.out.println("deque is empty");
		} else {
			System.out.println("deque is not empty");
		}

		// remove
		int retPoll = deque.poll();
		System.out.println("Element removed (poll) is " + retPoll);

		int retPop = deque.pop();
		System.out.println("Element removed (pop) is " + retPop);

		// adding elements using push() method
		deque.push(10);
		deque.push(15);


		System.out.println("Performing clear operation !!");
		//deque.clear();
		retval = deque.size();
		System.out.println("Now, deque consists of "+ retval +" elements");


		for (Integer number : deque) {
			System.out.println("Number = " + number);
		}

		// this will remove element at the first(head) postion
		retval = deque.removeFirst();
		System.out.println("Element removed is: " + retval);

		// let us print all the elements available in deque
		for (Integer number : deque) {
			System.out.println("Number = " + number);
		}

		// this will remove element at last position
		retval  = deque.removeLast();
		System.out.println("Element removed is: " + retval);

		// let us print all the elements available in this deque
		for (Integer number : deque) {
			System.out.println("Number = " + number);
		}

		System.out.println("printing elements in reverse order:");
		for(Iterator<Integer> descItr = deque.descendingIterator();descItr.hasNext();) {
			System.out.println(descItr.next());
		}

		// iterator() is used to print all the elements
		// next() returns the next element on each iteration
		System.out.println("printing elements using iterator:");
		for(Iterator<Integer> itr = deque.iterator();itr.hasNext();)  {
			System.out.println(itr.next());
		}


	}

}
