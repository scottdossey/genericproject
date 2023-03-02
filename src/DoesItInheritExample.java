
public class DoesItInheritExample {

	public static void main(String[] args) {
		Integer foo=3;
		
		Object bar=foo; //Because Integer inherits from Object this is legal.
		
		//foo=bar; //This doesn't work because an Object is not necessarily an
		           //Integer
		
		
		Box<Integer> box1 = new Box<>(1);		
		Box<Object> box2;
		
		box2 = box1;  //ERROR!!!!
		
	
		//Even though I can store an Integer into Object....
		//I cannot store a Box<Integer> into a Box<Object>
		

	}

}
