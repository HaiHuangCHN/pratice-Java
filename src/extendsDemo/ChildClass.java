package extendsDemo;

public class ChildClass extends SuperClass {

    public static class InnerClass {

        private String innerField;

        public String getInnerField() {
            return innerField;
        }

        public void setInnerField(String innerField) {
            this.innerField = innerField;
        }

    }

    private String childField;

    private InnerClass innerClassField;

    public String getChildField() {
        return childField;
    }

    public void setChildField(String childField) {
        this.childField = childField;
    }

    public InnerClass getInnerClassField() {
        return innerClassField;
    }

    public void setInnerClassField(InnerClass innerClassField) {
        this.innerClassField = innerClassField;
    }

}
