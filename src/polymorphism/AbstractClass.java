package polymorphism;

public abstract class AbstractClass {

    private String abstractA;

    private String abstractB;

    private String abstractC;

    public AbstractClass() {
        System.out.println("Enter AbstractClass no-argu Constructor");
    }

    public AbstractClass(String abstractA, String abstractB, String abstractC) {
        System.out.println("Enter AbstractClass argu Constructor");
        this.abstractA = abstractA;
        this.abstractB = abstractB;
        this.abstractC = abstractC;
    }

    public String sameNameMethod() {
        return "Default implementation of sameNameMethod(), any sub-class can override it, but not a must";
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
        return "AbstractClass [abstractA=" + abstractA + ", abstractB=" + abstractB + ", abstractC=" + abstractC + "]";
    }

}
