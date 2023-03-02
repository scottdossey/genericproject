
public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>("Hello");
		System.out.println(box1.getStoredItem());
		
		
		Box<Integer> box2 = new Box<>(7);
		System.out.println(box2.getStoredItem());

	}

}
