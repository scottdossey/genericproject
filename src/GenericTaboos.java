import java.util.ArrayList;
import java.util.List;

public class GenericTaboos<V> {
	
	public static <T> void T rule2() {
		return new T(); //illegal, cannot instantiate
		                // a type parameter.
	}
	
	//It makes no sense to have a static variable with a generic type.
	//private static V rule3Violation;
	
	public static void main(String[] args) {
		//There are several things you cannot do with generics...
		
		//1. You cannot use generics with primitive types.
		//List<int> myList = new ArrayList<>();  //not legal, must use
		                                         //wrapper type.
		
		//2. You cannot instantiate a value whose type is a type
		// parameter
		//String value = rule2(); //Does an illegal operation
		
		//3. You cannot declare static fields whose types are 
		//   type parameters.
		
		//4. In java there is an instanceof operator you can use to
		// test if something is an instance of another type. You cannot
		// instanceof to check type parameters for inheritance.
		
		//Valid use of instanceof.......
		Integer x;
		System.out.println(x instanceof Number);
		
		List<String> myList = new ArrayList<>();
		System.out.println(myList instanceof ArrayList);
		System.out.println(myList instanceof ArrayList<String>);
				
		//5. You cannot create arrays of parameterized types.
		V[] myArray; //Use an ArrayList<V> instead.
		
		//6. You can't throw Parameterized exceptions.
		ParameterizedException<String> value = new ParameterizedException<>();
		throw(value); //Not legal to throw...and the error is actually
		//showing up in the creation of ParameterizedException.
		
	}
}
