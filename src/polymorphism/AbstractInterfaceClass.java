package polymorphism;

// Abstract class don't have to implement methods in Interface
public abstract class AbstractInterfaceClass implements SubInterface {

    private String abstractInterfaceField1;

    private String abstractInterfaceField2;

    private String abstractInterfaceField3;

    public AbstractInterfaceClass() {
        System.out.println("Enter AbstractInterfaceClass no-argu Constructor");
    }

    public AbstractInterfaceClass(String abstractInterfaceField1, String abstractInterfaceField2, String abstractInterfaceField3) {
        System.out.println("Enter AbstractInterfaceClass argu Constructor");
        this.abstractInterfaceField1 = abstractInterfaceField1;
        this.abstractInterfaceField2 = abstractInterfaceField2;
        this.abstractInterfaceField3 = abstractInterfaceField3;
    }

    public String defaultMethod() {
        return "Default implementation of AbstractInterfaceClass.defaultMethod(), any sub-class can override it, but not a must";
    }

    /**
     * The abstract method can only be defined within an abstract class
     * 
     * @return
     */
    public abstract String abstractMethod();

    protected String getAbstractInterfaceA() {
        return abstractInterfaceField1;
    }

    protected String getAbstractInterfaceField1() {
        return abstractInterfaceField1;
    }

    protected void setAbstractInterfaceField1(String abstractInterfaceField1) {
        this.abstractInterfaceField1 = abstractInterfaceField1;
    }

    protected String getAbstractInterfaceField2() {
        return abstractInterfaceField2;
    }

    protected void setAbstractInterfaceField2(String abstractInterfaceField2) {
        this.abstractInterfaceField2 = abstractInterfaceField2;
    }

    protected String getAbstractInterfaceField3() {
        return abstractInterfaceField3;
    }

    protected void setAbstractInterfaceField3(String abstractInterfaceField3) {
        this.abstractInterfaceField3 = abstractInterfaceField3;
    }

    @Override
    public String toString() {
        return "AbstractInterfaceClass [abstractA=" + abstractInterfaceField1 + ", abstractB=" + abstractInterfaceField2 + ", abstractC=" + abstractInterfaceField3 + "]";
    }

}
