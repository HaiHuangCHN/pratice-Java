package polymorphism;

public class MainMethod {
    public static void main(String[] args) {
        NormalClass1 normalClass1NoArgu = new NormalClass1();
        System.out.println(normalClass1NoArgu.sameNameMethod());

        AbstractClass normalClass1Argu = new NormalClass1("normalA", "normalB", "normalC", "abstractA", "abstractB", "abstractC");
        System.out.println(normalClass1Argu.sameNameMethod());

//        // static methods cannot use this or super keywords
//        super.staticMethod();
//        this.staticMethod();

        AbstractClass normalClass3NoArgu = new NormalClass3();
        System.out.println(normalClass3NoArgu.sameNameMethod());

//        // Error as normalClassExtendInterface is not sub-class of SuperInterface1,
//        // error message: "The method superInterface1StaticMethod() is undefined for the
//        // type NormalClassExtendInterface"
//        NormalClassExtendInterface normalClassExtendInterface = new NormalClassExtendInterface();
//        System.out.println(normalClassExtendInterface.superInterface1StaticMethod1());

        System.out.println(SuperInterface1.superInterfaceStaticMethod());

        NormalClassExtendInterface normalClassExtendInterface = new NormalClassExtendInterface();
        System.out.println(normalClassExtendInterface.superInterfaceNonStaticMethod());

    }

}
