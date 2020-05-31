package pratice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class SmallPratice {

	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		System.out.print(str1);
		/*scanner.close();*/
		/*String str2 = */scanner.nextLine();
		/*System.out.print(str2);*/
		String str2 = scanner.next();

		BigInteger bi = new BigInteger("1");
		System.out.println(bi);
		if (bi.intValue() == 1) {
			System.out.println(bi);
		}
		System.out.println("Start:");
		char[] u = {'1'};
		System.out.println(u.toString());		
		Integer a = new Integer(1);
		System.out.println(a);
		String b = a.toString();
		System.out.println(b);
		if (b.equals("1")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
//		int a = 2;
//		String b = "Hai";
//		String c = null;
//		
//		String d = a + b + (c == null? "yes" : c.toString());
//		
//		System.out.println(d);
//		
//		if (d.equals("2Haiyes")) {
//			System.out.println("True");
//		}
	}

	@Test
	public void test2() {
		String possibleValues = "INT, EXT, ext, int";
		String[] possibleValuesArray = possibleValues.split(", ");
		List<String> possibleValuesList = Arrays.asList(possibleValuesArray);
		System.out.println(possibleValuesArray[0]);
		System.out.println(possibleValuesArray[1]);
		System.out.println(possibleValuesArray[2]);
		System.out.println(possibleValuesArray[3]);
		System.out.println(possibleValuesList);
	}

	@Test
	public void test3() {
		String values = "INT, EXT, ext, int";
		String[] valuesArray = values.split(" ");
		List<String> valuesList = Arrays.asList(valuesArray);
		System.out.println(valuesArray[0]);
		System.out.println(valuesArray[1]);
		System.out.println(valuesArray[2]);
		System.out.println(valuesArray[3]);
		System.out.println(valuesList);
	}

	@Test
	public void test4() {
		String text = " AAAAKG TTL";
		int index = text.indexOf("KG");// " AAAAKG TTL": 5, and indexOf("A") is 1. But "KA" is -1
		String str = text.substring(0, text.indexOf("KG"));
		String weight = text.substring(0, text.indexOf("KG")).replace("TTL", "").trim();
		System.out.println(index);
		System.out.println(str);
		System.out.println(weight);
	}

	@Test
	public void test5() {
		System.out.println("123".equals(null));
	}

	@Test
	public void test6() {
		String str = "AABBCCDD";

		System.out.println(str.substring(1, 8));

	}

	@Test
	public void test7() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

	}
	
	@Test
	public void test8() {
		String TEMPLATE = "Hello, %s!";
		String str = new String(String.format(TEMPLATE, "Huang, Hai"));
		System.out.println(str);
		String str2 = String.format(TEMPLATE, "Zeng, Zexuan");
		System.out.println(str2);
	}
	
	/**
	 * The difference when choose array as argument
	 */
	@Test
	public void test9() {
		int [] array = new int [3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		this.makeSomeChange(array);
		System.out.println(array[0] + ", " + array[1] + ", " +  array[2]);
	}

	private void makeSomeChange(int[] array) {
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
	}
	
	@Test
	public void test10() {
		char[] a = {'a', 'b'};
		printout(a);
	}

	private void printout(char[] a) {
		System.out.print(a[0]);
	}
	
	@Test
	public void test11() {
		int a = 7;
		if (a == 8) {			
			System.out.println("NULL == 8");
		}
	}
	
	@Test
	public void test12() {
		String str = "393.03";
		System.out.println(str.matches("-?\\d+(\\.\\d+)?"));
		System.out.println();	
	}

}