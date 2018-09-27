package practicePack;

public class Dog {
	String name;
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.bark();
		dog1.name = "Chuvavo";
		dog1.chaseCat();
		dog1.eat();
		System.out.println("");
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Zenie";
		myDogs[1].name = "Tommy";
		System.out.println("My Third Dog Name is " + myDogs[2].name);
		
		int x = 0;
		
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark() {
		System.out.println(name + " says bowwww boww.");
	}
	public void eat() {
		System.out.println("Doing is eating.");
	}
	public void chaseCat() {
		System.out.println("Dod is chasing Cat.");		
	}
}
