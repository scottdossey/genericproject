import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

	//Let's make process sum all the numbers in a list.
	public static double process(List<? extends Number> list) {
		double sum = 0.0;
		for(Number n: list) {
			sum += n.doubleValue();			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		//When declaring a type that takes generic
		//type parameters.....we have the option of using wildcards...
		
		List<Integer> myList = new ArrayList<>();
		List<Double> myList2 = new ArrayList<>();
		List<String> myList3 = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		System.out.println(process(myList));
		
		
		myList2.add(7.5);
		myList2.add(-1.3);
		System.out.println(process(myList2));							
	}

}
