package autoMobPack;

public class Car extends Vehicle implements VehicleInterface {
	
	public Car() {
		super();
	}

	public int start() {
		setRpm( 20 );
		setPowr( 100 );
		System.out.println("Car started, Engine whirring.");
		return 0;
	}

	public int stop() {
		setRpm( 0 );
		setPowr( 0 );
		System.out.println("You Just Stopped.");
		return 0;
	}
	
	public double accel(double a) {
		setRpm(getRpm() + a);
		setPowr(getPowr() + (10*a));
		if(getRpm() > 220) setRpm(220);
		if(getPowr() > 1000) setPowr(1000);
		System.out.println("You Accelerated to " + getRpm());
		move(a,a);
		return 0;
	}

	public double delec(double d) {
		setRpm(getRpm() - d);
		setPowr(getPowr() - (10*d));
		if(getRpm() > 220) setRpm(220);
		if(getPowr() > 1000) setPowr(1000);
		System.out.println("You Decelerated to " + getRpm());
		d = -d;
		//move( d , d );
		return 0;
	}

	public double move( double x, double y ) {
		//if ( getRpm() != 0 ) {
			//while( 0 < 1) {
			setXpos( getXpos() + x ) ;
			setYpos( getYpos() + y ) ;
			System.out.println("Distance travelled in X-axis is " + getXpos());
			System.out.println("Distance travelled in Y-axis is " + getYpos());
			double hypt = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			//if (10*x*y <= hypt || hypt < 20*x*y)
				System.out.println("Distance travelled by now is " + hypt);
			//}
		//} else {
			//System.out.println("You cannot move the car without starting the Engine.");
		//}
		
		return 0 ;
	}	
	
}
