package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;

public class CalendarPratice {
	
    public static final SimpleDateFormat yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd");

	@Test
	public void testCalendar() {

		Calendar c = Calendar.getInstance();
		System.out.println("The Current Date is:" + c.getTime());
		System.out.println("The Current Date is:" + c.getTimeZone().getID());

	}

	@Test
	public void testCalendar2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 1, 20);
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
	}
	
	@Test
	public void testCalendar3() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH);		// Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);		// 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY);// 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
			
		System.out.println(sdf.format(calendar.getTime()));
			
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
			
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);

	}
	
	@Test
	public void testCalendar4() throws ParseException {
		Date currentDate = new Date();
		System.out.println(currentDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		System.out.println(calendar.getTime());// return a Date object. Date --> Calendar
		calendar.add(Calendar.DAY_OF_MONTH, -31);
		System.out.println(calendar.getTime());
		currentDate = calendar.getTime();
		System.out.println(currentDate);		
		Date date1 = yyyy_MM_dd.parse(yyyy_MM_dd.format(currentDate));
		System.out.println(date1);
		
	}
	
	
	
	@Test
	public void testCalendar5() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

		Calendar calendar = new GregorianCalendar(2013, 10, 28);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		// add one month
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		// subtract 10 days
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

	}
	
	
	@Test
	public void testCalendar6() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date = sdf.parse(dateInString);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

	}
	
	@Test
	public void test7() {
		Date currentDate = new Date();
		Calendar captureAfter = Calendar.getInstance();
		captureAfter.setTime(currentDate);
		captureAfter.add(Calendar.SECOND, -600);
	}

}
