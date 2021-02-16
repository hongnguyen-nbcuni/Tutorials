import java.util.Stack;

// The class is based on the basic principle of last-in-first-out. 
// In addition to the basic push and pop operations, the class provides 
// three more functions of empty, search, and peek.

public class StackPushPopDemo {

	static void stack_push(Stack<Integer> stack) 
	{ 
		for(int i = 0; i < 5; i++) 
		{ 
			stack.push(i); 
		} 
	} 

	// Popping element from the top of the stack 
	static void stack_pop(Stack<Integer> stack) 
	{ 
		System.out.println("Pop Operation:"); 

		for(int i = 0; i < 5; i++) 
		{ 
			Integer y = (Integer) stack.pop(); 
			System.out.println(y); 
		} 
	} 

	
	 // Displaying element on the top of the stack 
    static void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top: " + element); 
    } 
      
    // Searching element in the stack 
    static void stack_search(Stack<Integer> stack, int element) 
    { 
        Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position: " + pos); 
    } 

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>(); 

		stack_push(stack); 
		System.out.println(stack); 	// [0, 1, 2, 3, 4]
		stack_pop(stack); 			// 4, 3, 2, 1, 0
		stack_push(stack); 	
		stack_peek(stack); 		// Element on stack top: 4
		stack_search(stack, 2); // Element is found at position: 3
		stack_search(stack, 6); // Element not found
	} 



}


