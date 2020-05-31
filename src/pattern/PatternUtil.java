package pattern;

import java.util.regex.Pattern;

public class PatternUtil {

	public static String formatStringRemoveLeadingZero(String number) {
		if (number != null) {
			number = number.replaceAll("^(0+)", "8");
		}
		return number;
	}

	public static boolean regExpressMatch(String content, String regFormat) {

		return Pattern.matches(regFormat, content);

	}
	
	
	
}
