package polymorphism;

public abstract class AbstractClass {

    private String abstractField1;

    private String abstractField2;

    private String abstractField3;

    public AbstractClass() {
        System.out.println("Enter AbstractClass no-argu Constructor");
    }

    public AbstractClass(String abstractField1, String abstractField2, String abstractField3) {
        System.out.println("Enter AbstractClass argu Constructor");
        this.abstractField1 = abstractField1;
        this.abstractField2 = abstractField2;
        this.abstractField3 = abstractField3;
    }

    public String defaultMethod() {
        return "Default implementation of AbstractClass.defaultMethod(), any sub-class can override it, but not a must";
    }

    public final String finalMethod() {
        return "Final method cannot be override by sub-class";
    }

    public static String staticMethod() {
        return "Static method cannot be override by sub-class";
    }

    /**
     * The abstract method can only be defined by an abstract class
     * 
     * @return
     */
    public abstract String abstractMethod();

    protected String getAbstractField1() {
        return abstractField1;
    }

    protected void setAbstractField1(String abstractField1) {
        this.abstractField1 = abstractField1;
    }

    protected String getAbstractField2() {
        return abstractField2;
    }

    protected void setAbstractField2(String abstractField2) {
        this.abstractField2 = abstractField2;
    }

    protected String getAbstractField3() {
        return abstractField3;
    }

    protected void setAbstractField3(String abstractField3) {
        this.abstractField3 = abstractField3;
    }

    @Override
    public String toString() {
        return "AbstractClass [abstractA=" + abstractField1 + ", abstractB=" + abstractField2 + ", abstractC=" + abstractField3 + "]";
    }

}
