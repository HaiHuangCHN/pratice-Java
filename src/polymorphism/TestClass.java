package polymorphism;

import java.util.Date;

public class TestClass implements Cloneable {

    private int id;

    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public TestClass clone() throws CloneNotSupportedException {
        return (TestClass) super.clone();
    }

}