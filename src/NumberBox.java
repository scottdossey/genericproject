
//We are going to a create a generic Box...
//just like our Box example, but we want to limit
//out box to storing Numbers...

//We can set multiple bounds by listing them with "&"'s in between
public class NumberBox<T extends Number /*& MyOtherInterface & Comparable*/> {
	//T is now a standin for a TYPE.
	private T storedItem;
	
	public NumberBox(T storedItem) {
		this.storedItem = storedItem;
	}

	public T getStoredItem() {
		return storedItem;
	}

	public void setStoredItem(T storedItem) {
		this.storedItem = storedItem;
	}
	
	public static void main(String[] args) {
		NumberBox<Integer> box1 = new NumberBox<>(1); //Integer.
		NumberBox<Double> box2 = new NumberBox<>(1.53); //Double
		
		//At this point we don't know if box1 stores
		//an Integer, Double, or any other class that inherits
		//from Number...so we have to cast to get the value back
		Integer x = box1.getStoredItem();
		Double y = box2.getStoredItem();
		System.out.println(x);
		System.out.println(y);
		//How do we make this illegal?
		//We use a TYPE PARAMETER "BOUND"
		//NumberBox<String> box3 = new NumberBox<>("Hello");
	}
}