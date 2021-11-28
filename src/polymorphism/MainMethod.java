package polymorphism;

public class MainMethod {
    public static void main(String[] args) {
        SubClass1 subClass1NoArgu = new SubClass1();
        System.out.println(subClass1NoArgu.defaultMethod());

        SubClass1 subClass1Argu = new SubClass1("field1", "field2", "field3", "abstractField1", "abstractField2",
                "abstractField3");
        System.out.println(subClass1Argu.defaultMethod());

//        // static methods cannot use this or super keywords
//        super.staticMethod();
//        this.staticMethod();
//        // final methods cannot use this or super keywords
//        super.finalMethod();
//        this.finalMethod();
        subClass1Argu.staticMethod();
        subClass1Argu.finalMethod();

        AbstractClass subClass3NoArgu = new SubClass3();
        System.out.println(subClass3NoArgu.defaultMethod());

//        // Error as subClassImplementsSuperInterface is not sub-class of SuperInterface1,
//        // error message: "The method superInterfaceStaticMethod() is undefined for the
//        // type SubClassExtendSuperInterface"
//        SubClassImplementsSuperInterface subClassImplementsSuperInterface = new SubClassImplementsSuperInterface();
//        System.out.println(subClassImplementsSuperInterface.superInterfaceStaticMethod());
        // The correct way to access superInterfaceStaticMethod
        System.out.println(SuperInterface1.superInterfaceStaticMethod());

        SubClassImplementsSuperInterface subClassImplementsSuperInterface = new SubClassImplementsSuperInterface();
        subClassImplementsSuperInterface.superInterfaceNonStaticMethod();

//        SubSubClass subSubClass = new SubSubClass();
//        SubClass subclass = new SubClass();
//        System.out.println(subclass.getString());
    }

}
