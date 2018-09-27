package dotPack;

import java.util.*;

public class Start {
	
	Scanner scn = new Scanner(System.in);
	String[][] grid = new String[7][7];
	
	public void game() {
		int hit = 0;
		for(int i=1; i>0; i++) {
			System.out.println("Please Guess the Number: ");
			int a = scn.nextInt();
			if(guess == dotPlace) {
				hit++;
			}
			
		}
		
	}
	
}
