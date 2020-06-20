package polymorphism;

public class NormalClass1 extends AbstractClass implements SubInterface {

    private String normalA1;

    private String normalB1;

    private String normalC1;

    public NormalClass1() {
        super();// it can be omitted as JVM would add for us. And JVM will invoke its super
                // class to create an instance
        // if inherit super class, please add super() as a best practice
        System.out.println("Enter NormalClass1 no-argu Constructor");
    }

    public NormalClass1(String normalA1, String normalB1, String normalC1, String abstractA, String abstractB, String abstractC) {
        super(abstractA, abstractB, abstractC);
        System.out.println("Enter NormalClass1 argu Constructor");
        this.normalA1 = normalA1;
        this.normalB1 = normalB1;
        this.normalC1 = normalC1;
    }

//  /**
//  * Cannot override the final method from super class
//  * 
//  * @return
//  */
// public String finalMethod() {
//     return "NormalCLass1 override default implementation";
// }

// /**
//  * Cannot override the static method from super class
//  * 
//  * @return
//  */
// public String staticMethod() {
//     return "NormalCLass1 override default implementation";
// }

    @Override
    public String sameNameMethod() {
        return "NormalCLass1 override default implementation";
    }

    @Override
    public String abstractMethod() {
        System.out.println("The type NormalClass1 must implement the inherited abstract method AbstractClass.abstractMethod()");
        return null;
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type NormalClass1 must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String subInterfaceMethod1() {
        System.out.println("The type NormalClass1 must implement the inherited abstract method Interface.interfaceMethod1()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type NormalClass1 must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type NormalClass1 must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
        return null;
    }

    public String getNormalA1() {
        return normalA1;
    }

    public void setNormalA1(String normalA1) {
        this.normalA1 = normalA1;
    }

    public String getNormalB1() {
        return normalB1;
    }

    public void setNormalB1(String normalB1) {
        this.normalB1 = normalB1;
    }

    public String getNormalC1() {
        return normalC1;
    }

    public void setNormalC1(String normalC1) {
        this.normalC1 = normalC1;
    }

    @Override
    public String toString() {
        return "NormalClass1 [normalA1=" + normalA1 + ", normalB1=" + normalB1 + ", normalC1=" + normalC1 + "]";
    }

}
