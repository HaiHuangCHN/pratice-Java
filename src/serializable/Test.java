package serializable;

import java.io.*;

public class Test {

    @org.junit.Test
    public void writeSerializableObject() {
        try {
            NameAndPassword nameAndPassword = new NameAndPassword("Huang, Hai", "123456");
            User user = new User(nameAndPassword, "Male", 23);
            user.setAddress("address");
            ObjectOutputStream objectOutputStream;
            try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject("This is a Test! ");
                objectOutputStream.writeObject(user);
                objectOutputStream.flush();
                objectOutputStream.close();
            }
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
                String string = (String)objectInputStream.readObject();
                User user = (User)objectInputStream.readObject();
                System.out.println(string);
                System.out.println("user.nameAndPassword.username: " + user.getNameAndPassword().getUsername());
                System.out.println("user.nameAndPassword.password: " + user.getNameAndPassword().getPassword());
                System.out.println("user.gender: " + user.getGender());
                System.out.println("user.address: " + user.getAddress());
                System.out.println("user.StaticField: " + User.staticField);
                System.out.println("Age: " + user.getAge());
                objectInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}