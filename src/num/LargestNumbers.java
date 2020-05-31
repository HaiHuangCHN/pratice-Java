package num;

import java.util.ArrayList;
import java.math.*;

public class LargestNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		// Add an integer
		list.add(45);
		// Add a double
		list.add(3445.53);
		// Add a BigInteger
		list.add(new BigInteger("3432323234344343101"));
		// Add a BigDecimal
		list.add(new BigDecimal("2.0909090989091343433344343"));
		
		System.out.println("The largest number is " + getLargestNumber(list));
	}
	
	public static Number getLargestNumber(ArrayList<Number> list) {
		if (list == null || list.size() == 0 /*means that the list is empty*/)
			return null;
		
		Number number = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (number.doubleValue() < list.get(i).doubleValue()) {
				number = list.get(i);
			}
		}
		
		return number;
	}
}
