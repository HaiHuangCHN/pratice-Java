package serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Man man;

    private String gender;

    private String address;

    private transient int age;

    public Person() {
        System.out.println("person constrctor");
    }

    public Person(Man man, String gender, int age) {
        this.man = man;
        this.gender = gender;
        this.age = age;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
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