package IO;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws Exception {
		File file = new File("test.txt");// no file will be created here
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		// Create a file
		PrintWriter output = new PrintWriter(file);// when call 'file', 'test.txt' will be created under parent path
		
		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		
		// Close the file
		output.close();
	}
}
