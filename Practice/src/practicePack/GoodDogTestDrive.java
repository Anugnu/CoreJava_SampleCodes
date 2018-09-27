package practicePack;

import java.util.*;

public class GoodDogTestDrive {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		GoodDog gd = new GoodDog();
		
		String S_input;
		int size_input = 0;
		while(1 == 1) {
			System.out.println("Please enter size of your Dog");
			System.out.println("Or 'exit' to end the program");
			
			S_input = scn.nextLine();
			try{
				size_input = Integer.parseInt(S_input);
				gd.setSize(size_input);
				gd.bark();
				System.out.println("");
			}
			catch(Exception e){
				if(S_input.equals("exit")){
					break;
					}
			}
			
		}
		
	}
	
}
