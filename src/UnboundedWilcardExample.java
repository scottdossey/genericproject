import java.util.ArrayList;
import java.util.List;

public class UnboundedWilcardExample {

	//Let's say I want to make function that will
	//print all the items in any list.
	public static void printList(List<?> list) {
		for(Object element: list) {
			System.out.print(element + " ");			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//The only time it makes sense to use 
		//Unbounded wildcards is if one of the following
		//is true......
		
		//1. You are implementing functionality
		// that for the type parameter only uses
		// methods/functionality provided by the object
		// class..
		Box<?> myBox = new Box<>("hello");
		
		Object value = myBox.getStoredItem();
		String myString = value.toString();
		
		//2. Is if you are writing methods in a
		//   generic class that don't depend on the type 
		//   parameter.  For example List.size 
		
		List<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Goodbye");
		printList(myList);
		
		List<Integer> myList2 = new ArrayList<Integer>();
		myList2.add(0);
		myList2.add(1);		
		myList2.add(2);
		printList(myList2);
		
		//printList is written to take a List<Object>
		//specifically...and we fell into the trap
		//that we cannot assign a List<String> to 
		//a List<Object>........
		//So if we modify printlist to use a wildcard....
		//it does make sense
		
		
		List<?> myWildcardList = myList;
		myWildcardList.size();
		
		
		
		
		
	}

}
