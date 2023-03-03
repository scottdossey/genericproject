
//Our first example of a GENERIC class definition.
public class Box<T> {
	//T is now a standin for a TYPE.
	private T storedItem;
	
	public Box(T storedItem) {
		this.storedItem = storedItem;
	}

	public T getStoredItem() {
		return storedItem;
	}

	public void setStoredItem(T storedItem) {
		this.storedItem = storedItem;
	}
	
}
