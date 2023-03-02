import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {
	
	//This is a method that gets an array Size,
	//but it only works with arrays that are of 
	//the String[] type.
	//How could we write this so it works with any array?
	public static int getArraySize(String[]  anArray) {
		return anArray.length;
	}
	
	public static <T> int getArraySize2(T[] anArray) {
		return anArray.length;
	}
	
	//This should work......but the problem is that 
	//we are using the ">" to compare two unknown types...	
	public static <T extends Comparable<T>> int countItemsGreaterThan(T[] anArray, T value) {
		int count = 0;
		for(T element: anArray) {
			//What we have to do is somehow replace this > sign with a method call.
			
			if (element.compareTo(value) > 0) { //Compiler error?
				                   //greater than signs don't work with all
				                   //types! HOW DO WE FIX THIS?
				count += 1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Integer[] array1 = {1,2,3};
		String[] array2 = {"hey", "you", "out", "there"};
		
		//System.out.println(getArraySize2(array1));
		//System.out.println(getArraySize2(array2));
	
		Integer[] x = {1,7,5,3,4,6,9};
		System.out.println(countItemsGreaterThan(x, 4)); 
		
		String[] y = {"a", "b", "c", "d", "e"};
		System.out.println(countItemsGreaterThan(y, "c"));
		
	}
}
