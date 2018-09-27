package practicePack;

import java.util.Scanner;
import java.lang.Exception;

public class BeerApp{
	Scanner bScan = new Scanner(System.in);
	Scanner reply = new Scanner(System.in);
	int bottCnt = 200;
	String urFav, reply1;
	String[] brand = {"Corona","Micheal","Heineken","BudLight"};
	int[] price = {'8','6','7','5'};
	public static void main(String[] args){
		BeerApp ba = new BeerApp();
		System.out.println("Hi, Welcome to Bottle99.");
		ba.order();
		ba.count();
		ba.stock();
		ba.price();
	}
	
	public void order(){
		int n = 0, x = 20, nBeer = 0, i=0;
		int[] ord = new int[10];
		System.out.println("Here is our Menu:" + "\n" + "0: Corona" + "\n" + "1: Micheal" + "\n" + "2: Heineken" + "\n" + "3: Budlight");
		System.out.println("Can I have your order");
		System.out.println("Code: ");
		try{
			n = bScan.nextInt();
			System.out.println("You have Selected " + brand[n]);
		} catch(Exception e){
			System.out.println("Sorry Enter the Correct Code Next Time.");
			order();
//			brk();
// I need to break after this......................
		}
		System.out.println("How Many?");
		System.out.println("Count: ");
		try{
			nBeer = bScan.nextInt();
			x = (int) (nBeer/10);
		} catch(Exception e){
			if(n>x) System.out.println("We Have Limit of " + x + " Beers per Person.");
		}
		System.out.println("You have Added: " + nBeer + " " + brand[n] + " Beer/s to the Cart.");
		for(i=0; i>=0; i++) {
			ord[i] = price[n]*nBeer;
		}
		System.out.println("Would you like to add anything else to the cart, reply 'yes' or 'no'" + "\n" + "Reply:");
		reply1 = reply.nextLine();
		if (reply1.equals("yes"))
		{
			order();
		}
		else
		{
			price();
		}
	}
/*	public void brk()
	{
		break;
	}
*/
	public void stock(){
		int i=1;
		while(i<bottCnt){
			count();
		}
		System.out.println("We Are Out of Stock");
	}
	
	public void count(){
		
	}
	public void price()
	{
		//price as they add item to cart
		
	}
}