import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {

	public static void main(String[] args) {
		//When Java was first created we didn't have
		//the angle brackets....nevertheless classes like 
		//List existed....they were modified with introduction
		//with Generics...
		
		//So how did we use a List is OLD OLD Java?
		
		//No type parameters.
		List myList = new ArrayList();
		
		
		//First of all, all the methods to List
		//took Object type, which everything inherits...
		
		String[] stringExamples = {"Scott", "Whatever", "Foo"};
		myList.add(stringExamples[0]);
		myList.add(stringExamples[1]);
		myList.add(stringExamples[2]);
		
		String myValue = (String)myList.get(1);
		                                //myList stores Objects...
		                                //so the only type 
		                                //info Java has about 
		                                //the return value is that
		                                //it is an object.
		
		//In order to pull items out of collections we lost the 
		//type information and had to use casts to convert
		//back to the proper type.
		
		//Old school Java typically had a lot of casting.
		//Modern Java very rarely needs a cast...because
		//of Generics and the ability to define collections
		//that old arbitrary types with type safety.
		
		
		
		
		
		
		
		
		

	}

}
