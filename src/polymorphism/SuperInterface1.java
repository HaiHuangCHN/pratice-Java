package polymorphism;

public interface SuperInterface1 {

    String overrideSuperInterface12Method();

    String superInterface1Method1();

    String superInterface1Method2();

    // Since JDK 1.8, must be invoked by SuperInterface1, no other way
    static String superInterfaceStaticMethod() {
        System.out.println("Invoke SuperInterface1 static method");
        return null;
    }

    // Since JDK 1.8, must be invoked by instance which implements this interface
    // Can be accessed from different package
    default String superInterfaceNonStaticMethod() {
        System.out.println("Invoke SuperInterface1 non-static method2");
        return null;
    }

}
