package locale;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Test;

public class LocalePratice {

	@Test
	public void testLocale() {
		Locale locale = new Locale("zh", "CN");
		NumberFormat currFmt = NumberFormat.getCurrencyInstance(locale);
		double amt = 123456.78;
		System.out.println(currFmt.format(amt));
	}

	@Test
	public void testLocale2() {
		Locale locale = new Locale("en", "US");
		Date date = new Date();
		DateFormat dateFmt = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(dateFmt.format(date));
	}

	@Test
	public void testLocale3() {
		String pattern1 = "{0}, hello! You have deposited {2} yuan in bank in {1}";
		String pattern2 = "At {1, time, short} On {1, date, long}, {0} paid {2, number, currency}.";

		Object[] params = { "John", new GregorianCalendar().getTime(), 1.0E3 };

		// One way
		String msg1 = MessageFormat.format(pattern1, params);
		System.out.println(msg1);

		// Another way
		MessageFormat mf = new MessageFormat(pattern2, Locale.US);
		String msg2 = mf.format(params);
		System.out.println(msg2);
		
		Date date = new Date();
		System.out.println(date);
	}

}
