package algorithm;

public class CalFib {
	public int fib(int input) {
		int result = 0;
		if (input == 0)
			return 0;
		else if (input == 1)
			return 1;
		else {
			fib(input);
		}
		return result;
	}

}
