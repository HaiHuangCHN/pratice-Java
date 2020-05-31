package polymorphism;

public class NormalClass2 extends AbstractInterfaceClass {

    private String normalA2;

    private String normalB2;

    private String normalC2;

    public NormalClass2() {
        super();
        System.out.println("Enter NormalClass2 no-argu Constructor");
    }

    public NormalClass2(String normalA2, String normalB2, String normalC2, String abstractA, String abstractB, String abstractC) {
        super(abstractA, abstractB, abstractC);
        System.out.println("Enter NormalClass2 argu Constructor");
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
        System.out.println("NormalClass2 Implement AbstractInterfaceClass,abstractMethod()");
        return null;
    }

    @Override
    public String method1() {
        System.out.println("NormalClass2 Implement Interface method1");
        return null;
    }

    @Override
    public String method2() {
        System.out.println("NormalClass2Implement Interface method2");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("NormalClass2 Implement superInterface1Method1");
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
        return "NormalClass2 [normalA2=" + normalA2 + ", normalB2=" + normalB2 + ", normalC2=" + normalC2 + "]";
    }

}
