package polymorphism;

public class SubClass2 extends AbstractInterfaceClass {

    private String normalA2;

    private String normalB2;

    private String normalC2;

    public SubClass2() {
        super();
        System.out.println("Enter SubClass2 no-argu Constructor");
    }

    public SubClass2(String normalA2, String normalB2, String normalC2, String abstractA, String abstractB, String abstractC) {
        super(abstractA, abstractB, abstractC);
        System.out.println("Enter SubClass2 argu Constructor");
        this.normalA2 = normalA2;
        this.normalB2 = normalB2;
        this.normalC2 = normalC2;
    }

    @Override
    public String sameNameMethod() {
        return "NormalCLass2 override default implementation";
    }

    @Override
    public String abstractMethod() {
        System.out.println("SubClass2 Implement AbstractInterfaceClass,abstractMethod()");
        return null;
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type SubClass2 must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String subInterfaceMethod1() {
        System.out.println("The type SubClass2 must implement the inherited abstract method Interface.interfaceMethod1()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type SubClass2 must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type SubClass2 must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
        return null;
    }

    public String getNormalA2() {
        return normalA2;
    }

    public void setNormalA2(String normalA2) {
        this.normalA2 = normalA2;
    }

    public String getNormalB2() {
        return normalB2;
    }

    public void setNormalB2(String normalB2) {
        this.normalB2 = normalB2;
    }

    public String getNormalC2() {
        return normalC2;
    }

    public void setNormalC2(String normalC2) {
        this.normalC2 = normalC2;
    }

    @Override
    public String toString() {
        return "SubClass2 [normalA2=" + normalA2 + ", normalB2=" + normalB2 + ", normalC2=" + normalC2 + "]";
    }

}
