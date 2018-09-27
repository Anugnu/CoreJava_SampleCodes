package practicePack;

public class Inheritance {
		 String getType() {
		 return "Inheritance";
		 }
}

public class Inheritance2 extends Inheritance {
	 String getType() {
	 return "Inheritance2";
	 }
}

public class Inheritance3 extends Inheritance2 {
	 String getType() {
	 return "Inheritance3";
}
public static void main(String[] args) {
	 Inheritance3 g1 = new Inheritance();
	 Inheritance3 g2 = new Inheritance2();
	 System.out.println(g1.getType() + " "
	 + g2.getType());
}
}

//								It won't work