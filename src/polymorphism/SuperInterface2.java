package polymorphism;

public interface SuperInterface2 {

    String overrideSuperInterface12Method();

    public static String superInterfaceStaticMethodSame() {
        System.out.println("SuperInterface2.superInterfaceStaticMethodSame: SuperInterface2 static method1");
        return null;
    }

    // Cause the following error:
    // Duplicate default methods named superInterfaceNonStaticMethod with the
    // parameters () and () are inherited from the types SuperInterface2 and
    // SuperInterface1
    // Just add one more argument could resolve it
    default String superInterfaceNonStaticMethod(String who) {
        System.out.println("SuperInterface2.superInterfaceNonStaticMethod: " + who + "is calling SuperInterface2 non-static method2");
        return null;
    }

}
