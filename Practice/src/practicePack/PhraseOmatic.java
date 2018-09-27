package practicePack;

public class PhraseOmatic {
	
	String[] list1 = {"Am", "We", "They", "She", "He"};
	String[] list2 = {"love", "is/are going", "moved to", "came from"};
	String[] list3 = {"India.", "USA.", "Australia.", "Canada."};
	
	public static void main(String[] args) {
		
		PhraseOmatic obj = new PhraseOmatic();
		obj.xyz();
	}
	
	public void xyz(){
		int ran1 = (int) (Math.random() * list1.length);
		int ran2 = (int) (Math.random() * list2.length);
		int ran3 = (int) (Math.random() * list3.length);
		
		System.out.println("What we have here- " + list1[ran1] + " " + list2[ran2]+ " " + list3[ran3]);
		
	}
}
