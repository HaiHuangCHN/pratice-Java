package exception;

public class InvalidRadiusException extends Exception {
	
	/** Construct an exception */
	public InvalidRadiusException(double radius) {
		super("Invalid radius: " + radius);
	}
	
}
