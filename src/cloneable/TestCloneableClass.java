package cloneable;

import java.util.Date;

import org.junit.Test;

public class TestCloneableClass {

    @Test
    public void testClone() throws CloneNotSupportedException {
        CloneableClass instance1 = new CloneableClass();
        instance1.setDate(new Date());
        instance1.setId(1);
        CloneableClass instance2 = instance1.clone();
        System.out.println("instance1 == instance2: ");
        System.out.println(instance1 == instance2);
        System.out.println("instance1.getDate() == instance2.getDate(): ");
        System.out.println(instance1.getDate() == instance2.getDate());
        instance2.setDate((Date) instance1.getDate().clone());
        System.out.println("instance1.getDate() == instance2.getDate(): ");
        System.out.println(instance1.getDate() == instance2.getDate());
    }

}