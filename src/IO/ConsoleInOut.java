package IO;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInOut {

	public static void main(String args[]) throws IOException {

		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c = (char) isr.read();
			while (c != 'q') {
				System.out.println(c);
				c = (char) isr.read();
			}
			;
		} finally {
			if (isr != null) {
				isr.close();
			}
		}
	}
}