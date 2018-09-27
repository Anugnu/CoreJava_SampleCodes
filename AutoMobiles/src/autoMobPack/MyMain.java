package autoMobPack;

public class MyMain {
	

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.setMyId("myCar");
		myCar.setMake("Lexus");
		myCar.setModel("Es350");
		myCar.start();
		myCar.accel(20);
		myCar.move(100, 100);
		myCar.stop();

		System.out.println((int)Math.sqrt(Math.pow(30, 2) + Math.pow(40, 2)));

		Car yourCar = new Car();
		yourCar.setMyId("yourCar");
		
		System.out.println("");
		
		Plane myPlane = new Plane();
		myPlane.start();
		myPlane.accel(200);
		myPlane.move(50, 50);
		myPlane.move(100, 40, 60);
		myPlane.stop();
		
	}

}
