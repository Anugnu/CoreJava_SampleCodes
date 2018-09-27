package cars_pack;

import java.util.Scanner;

public class Basic {
	int i, n;
	Scanner scan = new Scanner(System.in);
	
	public Basic(){
		//int n = 4; //this value is not loading.
		System.out.println("Constructor loaded");
	}
	
	public static void main(String[] args) {
		Basic ob = new Basic();		
		ob.wheels();
		ob.doors();
		ob.colors();
	}
	
	public void wheels() {
		System.out.println("This Car has 4 Wheels.");
	}
	
	public void doors() {
		System.out.println("This car has " + n + " Doors.");
	}
	
	public void colors() {
		int i, n;
		String[] clr = {"BrickRed", "Black", "Blue", "Gold"};
		
		System.out.println("\n" + "Now Its Time for " + "\n" + "Selecting Colour of your car :" + "\n" + "0: Brick Red" 
					+ "\n" + "1: Black" + "\n" + "2: Blue" + "\n" + "3: Gold" + "\n" + "Enter your value: ");
		try {
				i = scan.nextInt();
				System.out.println("You have selected " + clr[i] + " for your Car.");
		}
		catch(Exception e){
				System.out.println("Alright, we will go with default Black Colour.");
		}
		
	}

}
