package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
//		Test.writeSerializableObject();
		Test.readSerializableObject();
	}

	public static void writeSerializableObject() {
		try {
			Man man = new Man("Huang, Hai", "123456");
			Person person = new Person(man, "Male", 23);
			FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject("This is a Test! ");
			objectOutputStream.writeObject(person);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readSerializableObject() {
		try {
			FileInputStream fileInputStream = new FileInputStream("output.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream/* new FileInputStream("output.txt") */);
			String string = (String) objectInputStream.readObject();
			Person person = (Person) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(string);
			System.out.println("Man's username: " + person.getMan().getUsername());
			System.out.println("Man's password: " + person.getMan().getPassword());
			System.out.println("Gender: " + person.getGender());
			System.out.println("Age: " + person.getAge());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}