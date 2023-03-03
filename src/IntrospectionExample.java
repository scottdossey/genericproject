import java.util.ArrayList;
import java.util.List;

public class IntrospectionExample {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		
		System.out.println(myList.getClass());
		//It tells me it a java.util.ArrayList....
		//but what it doesn't tell us it is an 
		//ArrayList of String. It can't, because that 
		//information is lost when code is compiled
		//to byte code. Thus the name "TYPE ERASURE".
		
		
	}

}
