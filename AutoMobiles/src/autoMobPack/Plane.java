package autoMobPack;

public class Plane extends Vehicle implements VehicleInterface {
	
	private double Zpos;
	
	public double getZpos() {
		return Zpos;
	}

	public void setZpos(double Zpos) {
		this.Zpos = Zpos;
	}

	public Plane() {
		super();
	}
		
	public int start() {
		setRpm( 200 );
		setPowr( 1000 );
		System.out.println("Plane started, Engine whirring.");
		return 0;
	}

	public int stop() {
		setRpm( 0 );
		setPowr( 0 );
		System.out.println("You Just got Landed.");
		return 0;
	}

	public double accel(double a) {
		setRpm(getRpm() + a);
		setPowr(getPowr() + (50*a));
		if(getRpm() > 2200) setRpm(2200);
		if(getPowr() > 5000) setPowr(5000);
		System.out.println("You Accelerated to " + getRpm());
		//move(a,a);
		return 0;
	}

	public double delec(double d) {
		setRpm(getRpm() - d);
		setPowr(getPowr() - (50*d));
		if(getRpm() > 2200) setRpm(2200);
		if(getPowr() > 5000) setPowr(5000);
		System.out.println("You Decelerated to " + getRpm());
		d = -d;
		//move( d , d );
		return 0; //what's the  need of return, we can use void instead.
		//we are not send any data back by return.
	}

	public double move(double x, double y) {
		if(getRpm() > 0) {
			setXpos( getXpos() + x ) ;
			setYpos( getYpos() + y ) ;
			System.out.println("You are started moving");
		}
		return 0;
	}
	
	public void takeOff() {
		if(getRpm() > 1000) System.out.println("We are Taking Off.");
	}
	
	public double move(double x, double y, double z) {
		if(getRpm() > 0) {
			setXpos( getXpos() + x );
			setYpos( getYpos() + y );
			setZpos( getZpos() + z );
			System.out.println("You are Flying safe - Take rest.");
		}
		else System.out.println("You Didn't Start the Engine Yet.");
		return 0;
	}
	
}
