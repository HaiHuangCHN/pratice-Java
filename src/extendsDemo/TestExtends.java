package extendsDemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import extendsDemo.ChildClass.InnerClass;

public class TestExtends {

    @Test
    public void test1() {
        ChildClass childClass = new ChildClass();
        List<SuperClass> field = new ArrayList<SuperClass>();
        OuterClass outerClass = new OuterClass();
        InnerClass innerClassField = new InnerClass();
        innerClassField.setInnerField("innerField_test");
        childClass.setInnerClassField(innerClassField);
        childClass.setSuperField("superField_test");
        field.add(childClass);
        outerClass.setField(field);
    }

}
