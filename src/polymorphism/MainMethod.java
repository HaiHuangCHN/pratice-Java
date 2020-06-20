package polymorphism;

public class MainMethod {
    public static void main(String[] args) {
        SubClass1 subClass1NoArgu = new SubClass1();
        System.out.println(subClass1NoArgu.defaultMethod());

        AbstractClass subClass1Argu = new SubClass1("field1", "field2", "field3", "abstractField1", "abstractField2", "abstractField3");
        System.out.println(subClass1Argu.defaultMethod());

//        // static methods cannot use this or super keywords
//        super.staticMethod();
//        this.staticMethod();

        AbstractClass subClass3NoArgu = new SubClass3();
        System.out.println(subClass3NoArgu.defaultMethod());

//        // Error as subClassExtendInterface is not sub-class of SuperInterface1,
//        // error message: "The method superInterfaceStaticMethod() is undefined for the
//        // type SubClassExtendSuperInterface"
//        SubClassExtendSuperInterface subClassExtendInterface = new SubClassExtendSuperInterface();
//        System.out.println(subClassExtendInterface.superInterfaceStaticMethod());

        System.out.println(SuperInterface1.superInterfaceStaticMethod());

        SubClassExtendSuperInterface subClassExtendSuperInterface = new SubClassExtendSuperInterface();
        System.out.println(subClassExtendSuperInterface.superInterfaceNonStaticMethod());

        SubSubClass subSubClass = new SubSubClass();
    }

}
