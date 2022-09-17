package cloneable;

import java.util.Date;

public class CloneableClass implements Cloneable {

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
    public CloneableClass clone() throws CloneNotSupportedException {
        return (CloneableClass)super.clone();
    }

}