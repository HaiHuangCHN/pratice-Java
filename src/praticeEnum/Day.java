package praticeEnum;

public enum Day {
	SUN("Sunday"), MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday");

	Day(String day) {
		this.day = day;
	}

	public String day;

	public String getDay() {
		return day;
	}

}
