package practicePack;

public class ObjRef {
		 String name;
		 ObjRef(String n) {
		 name = n;
		 }
		 public static void main(String[] args) {
		 ObjRef m1 = new ObjRef("guitar");
		 ObjRef m2 = new ObjRef("tv");
		 System.out.println(m2.equals(m1));
		 }
		 public boolean equals(Object o) {
		 ObjRef m = (ObjRef) o;
		 if (m.name != null) {
		 return true;
		 }
		 return false;
		}

}
