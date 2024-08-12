import java.util.LinkedList;
import java.util.ListIterator;

public class SetOperations {
	// Update the code inside removeDuplicates method
	private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
		// update the return statement below to a correct value;
		return new LinkedList<Integer>();
		
		/* WRITE YOUR ALGORITHMIC COMPLEXITY JUSTIFICATION HERE
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	// Update the code inside union method
	private static LinkedList<Integer> union(
			LinkedList<Integer> list1,
			LinkedList<Integer> list2
	) {
		// update the return statement below to a correct value;
		return new LinkedList<Integer>();
				
		/* WRITE YOUR ALGORITHMIC COMPLEXITY JUSTIFICATION HERE
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	// DO NOT MODIFY printList - USED FOR TESTING
	private static void printList(LinkedList<Integer> list) {
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next());
			if (listIterator.hasNext()) {
				System.out.print("->");
			}
		}
		System.out.println();
	}
	
	// Sample test cases; you can modify the codes inside the main method.
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(7);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(3);
		list2.add(3);
		list2.add(7);
		list2.add(10);
		list2.add(12);
		
		printList(removeDuplicates(list1));
		printList(removeDuplicates(list2));
		printList(union(list1, list2));
	}
}
