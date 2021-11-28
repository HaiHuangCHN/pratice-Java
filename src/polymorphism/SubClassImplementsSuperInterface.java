package polymorphism;

public class SubClassImplementsSuperInterface implements SuperInterface1/* , SuperInterface2 */ {

    private String field1;

    public SubClassImplementsSuperInterface() {
        System.out.println("Enter SubClassImplementsSuperInterface no-argu Constructor");
    }

    public String superInterfaceStaticMethod() {
        System.out.println("The type SubClassImplementsSuperInterface must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type SubClassImplementsSuperInterface must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type SubClassImplementsSuperInterface must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type SubClassImplementsSuperInterface must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
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
