package practicePack;

public class GoodDog {
	
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	void bark() {
		if(size > 70 && size < 100) System.out.println("Woof Woof");
		else if(size > 35) System.out.println("Bow Boww");
		else if(size > 0) System.out.println("Waah Waah");
		else System.out.println("You don't have a Dog.");
	}
	
}
