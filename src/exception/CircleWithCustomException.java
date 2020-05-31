package exception;

public class CircleWithCustomException {
	
	/** The radius of the circle */
	private double radius;
	
	/** The number of the objects created */
	private static int numberOfObjects = 0;  
	
	/** Construct a circle with radius 1 */
	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}
	
	/** Construct a circle with a specified radius */
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius >= 0) {
			radius =  newRadius;
		}
		else
			throw new InvalidRadiusException(newRadius);// if forget throw exception, then caller cannot catch it.
	}
	
	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
