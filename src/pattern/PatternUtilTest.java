package pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PatternUtilTest {

	/*
	 * In conclusion of "p+": 1. p is a module, (0+: module is 0; (01)+: module is
	 * 01, but 01+: module is 1) 2. p+ == (p+) 3. ^(p+) will replace the leading,
	 * and the following two are the same: 3.1. number = number.replaceFirst("0+",
	 * "8"); 3.2. number = number.replaceAll("^(0+)", "8");
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testFormatStringRemoveLeadingZero() {
		String output = PatternUtil.formatStringRemoveLeadingZero("012000010123456");
		Assert.assertEquals("812000010123456", output);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testPattern() {
		Assert.assertTrue(Pattern.matches("0+.*", "000001010123456"));
	}

	@Test
	public void test1() {
		String a = "   123%^&aB)c  j \nLiy...";
		String format = a.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println("old: " + a);
		System.out.println("new: " + format);
		Assert.assertEquals("   123aBc  j Liy", format);
//		s= s.replaceAll("_", "").replaceAll(" ", "_").replaceAll("\\W", "").replaceAll("_", " "); 
//		String regEx ="[^ a-zA-Z0-9]";
//				Pattern p = Pattern.compile(regEx); 
//				Matcher m = p.matcher(testStr);
//				System.out.print("'"+m.replaceAll("")+"'"); 
//		String a = "   123%^&aB)c jLiy...";
//				String format = a.replaceAll("[^ a-zA-Z0-9]", ""); 
	}

	@Test
	public void testSplit() {
//		String[] strArray = "sda,      asdf,jjuy".split(", +|,");// Be cautious: there is a sequence when do mapping,
//																	// for example ", |," and ",|, "
		String[] strArray = "abc".split(",");// Be cautious: there is a sequence when do mapping,
																// for example ", |," and ",|, "
		for (String str : strArray) {
			System.out.println(str.trim());
		}
	}

	@Test
	public void testContains() {
		List<String> strList = new ArrayList<>();
		String str = null;
		System.out.println(strList.contains(str));
	}

	@Test
	public void testReg() {
//		String str = "a111B2";
		String str = "1aS2B";
//		System.out.println(str.matches("[a-z[A-Z][0-9]]*"));
//		System.out.println(str.matches("([a-z[A-Z]][0-9]*)*"));
		System.out.println(str.matches("([0-9][a-z[A-Z]]*)*"));
	}

	@Test
	public void testAuth() {
		String auth = "AUTH";
		String str = "";
		System.out.println(str.matches(".*AUTH.*"));
		String regExp = ".*" + auth + ".*";
		System.out.println(regExp);
		System.out.println(str.matches(regExp));
	}
	
	@Test
	public void toRegex() {
		String patternFromDb = "...1A*";
		StringBuffer regex = new StringBuffer();
		Matcher m = Pattern.compile("\\.{1,}|\\*{1,}|[^.*]+").matcher(patternFromDb);
		while (m.find()) {
			String s = m.group();
			switch (s.charAt(0)) {
			case '.':
				// leave dots as they are
				break;
			case '*':
				m.appendReplacement(regex, ".*"); // replace * with .*
				break;
			default:
				m.appendReplacement(regex, Matcher.quoteReplacement(s)); // escape literal match
			}
		}
		Pattern a = Pattern.compile(m.appendTail(regex).toString());
		
	}
	

}
