package mypack;

class RectangleLib  {

	// return normal or error condition
	public int myFunc() throws AppException {
		int zcode = 0 ;
		// logic here
		if ( zcode == 0 )
			throw new AppException("zcode");
		return 1 ;
	}
	
}


public class Rectangle extends Shape implements ShapeApi {
	private int mylength, myheight;
	
	// return normal or error condition
	public int firstLevel() {
		int rcode = 0 ;  // return code
		
		// some logic here
		try {
			rcode = secondLevel();
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if( rcode < 0 ) { 
			// show error
			return -1 ;
		}
		return 1;
	}

	// return normal or error condition
	
	public int secondLevel() throws AppException {
		int mcode = 0 ;
		
		RectangleLib rl = new RectangleLib() ;
		mcode = rl.myFunc();
		if ( mcode == 0 ) 
			return -1 ;  // error case
		return 1;
	}
	
	
	public void draw() {
		System.out.println("draw");
	}

	public void rotate() {
		System.out.println("rotate");
	}

	public void tilt() {
		System.out.println("tilt");
	}
	
	public void draw(int a, int b) {
		System.out.println("draw rec " + a);
		System.out.println("draw rec " + b);
		int x = 222;
	}
	
	// passing the parameters to methods
	// pass by value
	public void draw(String m,String n) {
		// here it reads the parameters from stack
		System.out.println("rectangle draw x " + m + " y " + n);
		m = "Changed" ;
	}
	
	// pass by reference
	public void draw(Rectangle y) {
		System.out.println("rect mylength " + y.mylength);
		System.out.println("rect myheight " + y.myheight);
		y.mylength = 222;
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		
		int myerr = obj.firstLevel() ;
		if ( myerr < 0 ) {
			System.err.println("Error " );
		}
				
		obj.draw();
		// from Bhaskar 
		String x = "2";    // String
		String y = "5" ;   // String
		obj.draw(x,y); //  the value 2 is pushed on the stack
		//System.out.println("rect2 mylength " + robj.mylength);		
		obj.draw("[--]","not");
		
		Rectangle robj = new Rectangle();
		robj.mylength = 10;
		robj.myheight = 20;
		obj.draw( robj );
		System.out.println("rect2 mylength " + robj.mylength);
		System.out.println("rect2 myheight " + robj.myheight);
		
		System.out.println("x " + x );
		obj.rotate();
		obj.tilt();
		
		Circle cObj = new Circle();
		cObj.draw();
	}
}
