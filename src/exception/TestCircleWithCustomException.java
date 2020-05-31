package exception;

public class TestCircleWithCustomException {
	public static void main(String[] args) {
		try {
			CircleWithCustomException c1 = new CircleWithCustomException(5);
			System.out.println(c1.getRadius());
			CircleWithCustomException c2 = new CircleWithCustomException(-5);
			System.out.println(c2.getRadius());
			CircleWithCustomException c3 = new CircleWithCustomException(0);
			System.out.println(c3.getRadius());
		}
		catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " + 
				CircleWithCustomException.getNumberOfObjects());
	}
}