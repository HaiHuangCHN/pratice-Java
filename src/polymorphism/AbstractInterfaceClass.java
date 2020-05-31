package polymorphism;

public abstract class AbstractInterfaceClass implements Interface {

    private String abstractA;

    private String abstractB;

    private String abstractC;

    public AbstractInterfaceClass() {
        System.out.println("Enter AbstractInterfaceClass no-argu Constructor");
    }

    public AbstractInterfaceClass(String abstractA, String abstractB, String abstractC) {
        System.out.println("Enter AbstractInterfaceClass argu Constructor");
        this.abstractA = abstractA;
        this.abstractB = abstractB;
        this.abstractC = abstractC;
    }

    public String sameNameMethod() {
        return "Default implementation, any sub-class can override it";
    }

    public final String finalMethod() {
        return "Final method cannot be override by sub-class";
    }

    /**
     * The abstract method can only be defined by an abstract class
     * 
     * @return
     */
    public abstract String abstractMethod();

    public String getAbstractA() {
        return abstractA;
    }

    public void setAbstractA(String abstractA) {
        this.abstractA = abstractA;
    }

    public String getAbstractB() {
        return abstractB;
    }

    public void setAbstractB(String abstractB) {
        this.abstractB = abstractB;
    }

    public String getAbstractC() {
        return abstractC;
    }

    public void setAbstractC(String abstractC) {
        this.abstractC = abstractC;
    }

    @Override
    public String toString() {
        return "AbstractInterfaceClass [abstractA=" + abstractA + ", abstractB=" + abstractB + ", abstractC=" + abstractC + "]";
    }

}
