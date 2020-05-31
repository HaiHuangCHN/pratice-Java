package thisKeyWord;

public class InvokeForTest {
	public static void main(String[] args) {
		/*
		 * Two way to invoke constructor
		 */
		PraticeThisKeyWord testThisKeyWord = new PraticeThisKeyWord();
		PraticeThisKeyWord testThisKeyWordWithArg = new PraticeThisKeyWord(5);
		
		/*testThisKeyWord.setP(5);*/
		
		/*
		 * We should define "get(argument)" method, so that we can invoke it to get what we want.
		 * Or we will get reference result. (Note: there will be no error when compile or run)
		 */
		System.out.println(testThisKeyWordWithArg.getP());
		
	}

}
