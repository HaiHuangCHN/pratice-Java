package polymorphism;

public interface SuperInterface1 {

    String sameSuperInterfaceMethod();

    String superInterface1Method1();

    String superInterface1Method2();

    // since JDK 1.8, must be invoked by SuperInterface1, no other way
    public static String superInterfaceStaticMethod() {
        System.out.println("SuperInterface1 static method");
        return null;
    }

    // since JDK 1.8, must be invoked by instance which implements this interface
    // can be accessed from different package
    default String superInterfaceNonStaticMethod() {
        System.out.println("SuperInterface1 non-static method2");
        return null;
    }

}
