package pratice;

public class SwitchTest {

	enum Day {
		SUN, MON, TUE, WED, THU, FRI, SAT
	}

	static Day day = Day.MON;

	static Day[] days = Day.values();

	public static void main(String[] args) {
		for (Day day : days) {
			System.out.print(day + " ");
		}
		System.out.print("\n");
		System.out.println(days);

		/*
		 * switch (VARIABLE)
		 */
		switch (day) {
		/*
		 * case (concrete VALUE):
		 */
		case SUN:
			System.out.println("Sun");
			break;
		case MON:
			System.out.println("Mon");
			break;
		case TUE:
			System.out.println("Tue");
			break;
		case WED:
			System.out.println("Wed");
			break;
		case THU:
			System.out.println("Thu");
			break;
		case FRI:
			System.out.println("Fri");
			break;
		case SAT:
			System.out.println("Sat");
			break;
		default:
			break;
		}

	}

}
