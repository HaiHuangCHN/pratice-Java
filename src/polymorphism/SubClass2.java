package polymorphism;

public class SubClass2 extends AbstractInterfaceClass {

    private String field1;

    private String field2;

    private String field3;

    public SubClass2() {
        super();
        System.out.println("Enter SubClass2 no-argu Constructor");
    }

    public SubClass2(String field1, String field2, String field3, String abstractField1, String abstractField2, String abstractField3) {
        super(abstractField1, abstractField2, abstractField3);
        System.out.println("Enter SubClass2 argu Constructor");
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String defaultMethod() {
        return "NormalCLass2 override default implementation";
    }

    @Override
    public String abstractMethod() {
        System.out.println("SubClass2 Implement AbstractInterfaceClass.abstractMethod()");
        return null;
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type SubClass2 must implement the inherited abstract method SubInterface.overrideSuperInterface12Method()");
        return null;
    }

    @Override
    public String subInterfaceMethod1() {
        System.out.println("The type SubClass2 must implement the inherited abstract method SubInterface.subInterfaceMethod1()");
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

    protected String getField1() {
        return field1;
    }

    protected void setField1(String field1) {
        this.field1 = field1;
    }

    protected String getField2() {
        return field2;
    }

    protected void setField2(String field2) {
        this.field2 = field2;
    }

    protected String getField3() {
        return field3;
    }

    protected void setField3(String field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "SubClass2 [normalA2=" + field1 + ", normalB2=" + field2 + ", normalC2=" + field3 + "]";
    }

}
