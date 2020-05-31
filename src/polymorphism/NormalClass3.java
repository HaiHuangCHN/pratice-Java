package polymorphism;

public class NormalClass3 extends AbstractClass implements Interface {

    private String normalA3;

    private String normalB3;

    private String normalC3;

    public NormalClass3() {
        super();
        System.out.println("Enter NormalClass3 no-argu Constructor");
    }

    public NormalClass3(String normalA3, String normalB3, String normalC3, String abstractA, String abstractB, String abstractC) {
        super(abstractA, abstractB, abstractC);
        System.out.println("Enter NormalClass3 argu Constructor");
        this.normalA3 = normalA3;
        this.normalB3 = normalB3;
        this.normalC3 = normalC3;
    }

    @Override
    public String sameNameMethod() {
        return "NormalCLass3 override default implementation";
    }

    @Override
    public String abstractMethod() {
        System.out.println("NormalClass3 Implement abstractMethod");
        return null;
    }

    @Override
    public String method1() {
        System.out.println("NormalClass3 Implement Interface method1");
        return null;
    }

    @Override
    public String method2() {
        System.out.println("NormalClass3 Implement Interface method2");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("NormalClass3 Implement superInterface1Method1");
        return null;
    }

    public String getNormalA3() {
        return normalA3;
    }

    public void setNormalA3(String normalA3) {
        this.normalA3 = normalA3;
    }

    public String getNormalB3() {
        return normalB3;
    }

    public void setNormalB3(String normalB3) {
        this.normalB3 = normalB3;
    }

    public String getNormalC3() {
        return normalC3;
    }

    public void setNormalC3(String normalC3) {
        this.normalC3 = normalC3;
    }

    @Override
    public String toString() {
        return "NormalClass3 [normalA3=" + normalA3 + ", normalB3=" + normalB3 + ", normalC3=" + normalC3 + "]";
    }

}
