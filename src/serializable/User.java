package serializable;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public static String staticField = "static field won't be serialized";

    private NameAndPassword nameAndPassword;

    private String gender;

    private String address;

    private transient int age;

    public User() {
        System.out.println("person constrctor");
    }

    public User(NameAndPassword nameAndPassword, String gender, int age) {
        this.nameAndPassword = nameAndPassword;
        this.gender = gender;
        this.age = age;
    }

    public NameAndPassword getNameAndPassword() {
        return nameAndPassword;
    }

    public void setNameAndPassword(NameAndPassword nameAndPassword) {
        this.nameAndPassword = nameAndPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}