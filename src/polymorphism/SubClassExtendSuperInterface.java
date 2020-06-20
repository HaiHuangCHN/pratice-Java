package polymorphism;

public class SubClassExtendSuperInterface implements SuperInterface1/* , SuperInterface2 */ {

    private String field1;

    public SubClassExtendSuperInterface() {
        System.out.println("Enter SubClassExtendSuperInterface no-argu Constructor");
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type SubClassExtendSuperInterface must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type SubClassExtendSuperInterface must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type SubClassExtendSuperInterface must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
        return null;
    }

    @Override
    public String superInterfaceNonStaticMethod() {
        return SuperInterface1.super.superInterfaceNonStaticMethod();
    }

    protected String getField1() {
        return field1;
    }

    protected void setField1(String field1) {
        this.field1 = field1;
    }

}
