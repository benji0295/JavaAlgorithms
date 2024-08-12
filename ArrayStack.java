public class ArrayStack {
	@SuppressWarnings("unused")
	private int[] internalArray;
	
	// DO NOT MODIFY THE CONSTRUCTOR - USED FOR TESTING
	public ArrayStack() {
		internalArray = new int[5];
	}
	
	// Update the code inside push method; add an item to a stack
	public void push(int x) {
		
	}
	
	// Update the code inside pop method; remove an item from a stack
	public int pop() {
		// update the return statement below to a correct value;
		return 0;
	}
	
	// Update the code inside peek method;
	// return an item that will be popped when pop() is called, don't remove an item from a stack.
	public int peek() {
		// update the return statement below to a correct value;
		return 0;
	}
	
	// Update the code inside size method
	public int size() {
		// update the return statement below to a correct value;
		return 0;		
	}
	
	// Sample test cases; you can modify the codes inside the main method.
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		while (stack.size() > 0) {
			System.out.println(stack.size());
			System.out.println(stack.peek());
			System.out.println(stack.pop());
		}
	}
}
