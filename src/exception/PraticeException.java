package exception;

public class PraticeException {
	public static void main(String[] args) {
		try {
			System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
		} catch (Exception ex) {
			System.out.println("ex.toString(): ");
			ex.toString();
//			ex.printStackTrace();
//			System.out.println(ex.getLocalizedMessage());
//			System.out.println(ex.getMessage());
//			System.out.println(ex.getCause());
//			System.out.println(ex.getClass());
			System.out.println(ex.getStackTrace());
//			System.out.println(ex.getSuppressed());
//			System.out.println(ex.toString());

			System.out.println("\nTrace Info Obtained from getStackTrace");
			StackTraceElement[] StackTraceElements = ex.getStackTrace();
			for (int i = 0; i < StackTraceElements.length; i++) {
				System.out.print("method " + StackTraceElements[i].getMethodName() + "("
						+ StackTraceElements[i].getClassName() + ":" + StackTraceElements[i].getLineNumber() + ")");
			}
		}
	}

	private static int sum(int[] list) {
		int result = 0;
		for (int i = 0; i <= list.length; i++)
			result += list[i];
		return result;
	}
}
