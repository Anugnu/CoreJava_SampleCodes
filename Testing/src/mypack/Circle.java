package mypack;

public class Circle extends Shape implements ShapeApi{
	public int myDia;
	
	public void draw() {
		System.out.println("draw circle");
	}

	public void rotate() {
		System.out.println("rotate");
	}

	public void tilt() {
		System.out.println("tilt");
	}
	
	public void draw(int a, int b) {
		System.out.println("draw circle " + a);
	}
}
