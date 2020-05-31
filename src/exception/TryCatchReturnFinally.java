package exception;

public class TryCatchReturnFinally {

	public static void main(String[] args) {

		System.out.println(test1());
	}

	public static int test1() {

		int b = 1;

		try {
			System.out.println("try block");
			throw new InvalidRadiusException(2);
		} catch (InvalidRadiusException e) {
			b = 2;
			System.out.println("1st catch block");
			return b;
		} catch (Exception e) {
			b = 3;
			System.out.println("2nd catch block");
			return b;
		} finally {
			System.out.println("finally block");
		}
	}		
}
