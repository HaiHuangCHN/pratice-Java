package praticeEnum;

public class InvokeEnum {
	public static void main(String[] args) {
		Day day1 = Day.WED;
		Day day2 = Day.SUN;
		System.out.println(day1.name());
		System.out.println(day1.ordinal());
		System.out.println(day1.toString());
		System.out.println(day2.compareTo(day1));

		String day3 = Day.MON.getDay();
		System.out.println(day3);

	}
}
