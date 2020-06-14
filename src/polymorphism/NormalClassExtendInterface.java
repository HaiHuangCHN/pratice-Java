package polymorphism;

public class NormalClassExtendInterface implements SuperInterface1/* , SuperInterface2 */{

    private String field1;

    public NormalClassExtendInterface() {
        System.out.println("Enter NormalClassExtendInterface no-argu Constructor");
    }

    public NormalClassExtendInterface(String normalA1) {
        System.out.println("Enter NormalClassExtendInterface argu Constructor");
        this.field1 = normalA1;
    }

    @Override
    public String sameSuperInterfaceMethod() {
        System.out.println("The type NormalClassExtendInterface must implement the inherited abstract method Interface.sameSuperInterfaceMethod()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type NormalClassExtendInterface must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type NormalClassExtendInterface must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
        return null;
    }

//    // Duplicate default methods named superInterfaceNonStaticMethod with the
//    // parameters () and () are inherited from the types SuperInterface2 and
//    // SuperInterface1
//    @Override
//    public String superInterfaceNonStaticMethod() {
//        return SuperInterface1.super.superInterfaceNonStaticMethod();
//    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

}
