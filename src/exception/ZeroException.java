package exception;

/*public class ZeroException {    
	public static void main(String[] args) {
		int x = 5 / 0;
		System.out.println(x);
	}
}*/



/*public class ZeroException {
	
	public static void main(String[] args) {
		try {
			int x = 5 / 0;
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program is still running here!");
	}
}
*/

/*public class ZeroException {    
	
	 * If add "throws Exception", then we should handle the possible exception or throws another exception from caller
	 
	private static void byZero() throws Exception {
		int x = 5 / 0;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		try {
			byZero();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program is still running here!");
	}
}
*/
/*
java.lang.ArithmeticException: / by zero
Program is still running here!
	at pratice.Exception.ZeroException.byZero(ZeroException.java:29)
	at pratice.Exception.ZeroException.main(ZeroException.java:35)
*/


public class ZeroException {    
	
	private static void creatException() throws BlogAppException {
		System.out.println("Let's assume BlogAppException happened when executing `create` command");
		throw new BlogAppException("create");//throw + object (new BlogAppException("create"))
	}
	
	private static void byZero() throws ArithmeticException {
		int x = 5 / 0;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		try {
			/*byZero();*/
			creatException();
		}catch (BlogAppException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Program will run `finally` code block!");
		}
		System.out.println("Program is still running here!");
	}
}
/*
 * why 'Program is still running here!' display before Exception?
let's assume BlogAppException happened when executing `create` command
Program is still running here!
Exception happened when executing command create
	at pratice.Exception.ZeroException.creatException(ZeroException.java:57)
	at pratice.Exception.ZeroException.main(ZeroException.java:68)
*/
