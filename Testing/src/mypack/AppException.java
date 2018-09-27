package mypack;

public class AppException extends Exception {
	
	public AppException( String myMsg ) {
		System.out.println( "AppException: Error " + myMsg );
	}

}
