package polymorphism;

public class SubClass1 extends AbstractClass implements SubInterface {

    private String field1;

    private String field2;

    private String field3;

    public SubClass1() {
        super();// it can be omitted as JVM would add for us. And JVM will invoke its super
                // class to create an instance
        // if inherit super class, please add super() as a best practice
        System.out.println("Enter SubClass1 no-argu Constructor");
    }

    public SubClass1(String field1, String field2, String field3, String abstractField1, String abstractField2, String abstractField3) {
        super(abstractField1, abstractField2, abstractField3);
        System.out.println("Enter SubClass1 argu Constructor");
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

//    /**
//     * Cannot override the final method from super class
//     * 
//     * @return
//     */
//    public String finalMethod() {
//        return "NormalCLass1 override default implementation";
//    }

//    /**
//     * Cannot override the static method from super class
//     * 
//     * @return
//     */
//    public String staticMethod() {
//        return "NormalCLass1 override default implementation";
//    }

    @Override
    public String defaultMethod() {
        return "SubClass1 override default implementation";
    }

    @Override
    public String abstractMethod() {
        System.out.println("The type SubClass1 must implement the inherited abstract method AbstractClass.abstractMethod()");
        return null;
    }

    @Override
    public String overrideSuperInterface12Method() {
        System.out.println("The type SubClass1 must implement the inherited abstract method SubInterface.overrideSuperInterface12Method()");
        return null;
    }

    @Override
    public String subInterfaceMethod1() {
        System.out.println("The type SubClass1 must implement the inherited abstract method SubInterface.subInterfaceMethod1()");
        return null;
    }

    @Override
    public String superInterface1Method1() {
        System.out.println("The type SubClass1 must implement the inherited abstract method SuperInterface1.superInterface1Method1()");
        return null;
    }

    @Override
    public String superInterface1Method2() {
        System.out.println("The type SubClass1 must implement the inherited abstract method SuperInterface1.superInterface1Method2()");
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
        return "SubClass1 [normalA1=" + field1 + ", normalB1=" + field2 + ", normalC1=" + field3 + "]";
    }

}
