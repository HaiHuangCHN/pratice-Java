package polymorphism;

public abstract class AbstractInterfaceClass implements SubInterface {

    private String abstractInterfaceA;

    private String abstractInterfaceB;

    private String abstractInterfaceC;

    public AbstractInterfaceClass() {
        System.out.println("Enter AbstractInterfaceClass no-argu Constructor");
    }

    public AbstractInterfaceClass(String abstractInterfaceA, String abstractInterfaceB, String abstractInterfaceC) {
        System.out.println("Enter AbstractInterfaceClass argu Constructor");
        this.abstractInterfaceA = abstractInterfaceA;
        this.abstractInterfaceB = abstractInterfaceB;
        this.abstractInterfaceC = abstractInterfaceC;
    }

    public String sameNameMethod() {
        return "Default implementation of sameNameMethod(), any sub-class can override it, but not a must";
    }

    /**
     * The abstract method can only be defined by an abstract class
     * 
     * @return
     */
    public abstract String abstractMethod();

    protected String getAbstractInterfaceA() {
        return abstractInterfaceA;
    }

    protected void setAbstractInterfaceA(String abstractInterfaceA) {
        this.abstractInterfaceA = abstractInterfaceA;
    }

    protected String getAbstractInterfaceB() {
        return abstractInterfaceB;
    }

    protected void setAbstractInterfaceB(String abstractInterfaceB) {
        this.abstractInterfaceB = abstractInterfaceB;
    }

    protected String getAbstractInterfaceC() {
        return abstractInterfaceC;
    }

    protected void setAbstractInterfaceC(String abstractInterfaceC) {
        this.abstractInterfaceC = abstractInterfaceC;
    }

    @Override
    public String toString() {
        return "AbstractInterfaceClass [abstractA=" + abstractInterfaceA + ", abstractB=" + abstractInterfaceB + ", abstractC=" + abstractInterfaceC + "]";
    }

}
