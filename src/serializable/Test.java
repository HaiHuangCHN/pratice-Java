package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

    @org.junit.Test
    public void writeSerializableObject() {
        try {
            Man man = new Man("Huang, Hai", "123456");
            Person person = new Person(man, "Male", 23);
            ObjectOutputStream objectOutputStream;
            try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject("This is a Test! ");
                objectOutputStream.writeObject(person);
            }
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void readSerializableObject() {
        try {
            ObjectInputStream objectInputStream;
            try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
                objectInputStream = new ObjectInputStream(fileInputStream);
            }
            String string = (String)objectInputStream.readObject();
            Person person = (Person)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(string);
            System.out.println("Man's username: " + person.getMan().getUsername());
            System.out.println("Man's password: " + person.getMan().getPassword());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}