import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {

	//We are going to write a function that
	//adds 1-10 to a list.
	//AddNumbers currently only works with a List 
	//of Integers.
	public static void addNumbers(List<? super Integer> list) {
		for(int i=1; i <= 10; ++i) {
			list.add(i);			
		}
	}
		
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		addNumbers(myList);
		System.out.println(myList);
		
		
		//An Integer can be stored to any of its 
		//superclasses...
		//Integer can be stored to Object
		//Integer can be stored to Number
		//Integer can be stored to Integer itself.
		//Can we change addNumbers to allow it work with
		//List<Object>, List<Numbers>, and List<Integer>
		
		
		List<Object> myList2 = new ArrayList<>();		
		addNumbers(myList2);
		System.out.println(myList2);
	}
	//It is legal to have an Lower bounded wildcard or 
	//an upper bounded wildcard, but not both...
	//IE--you would never use super and extends at the same time.
	

}
