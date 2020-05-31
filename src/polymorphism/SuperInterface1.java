package polymorphism;

public interface SuperInterface1 {

    String superInterface1Method1();

    String superInterface1Method2();

    String sameSuperInterfaceMethod();

    // since JDK 1.8
    public static String superInterface1StaticMethod() {
        System.out.println("SuperInterface1 static method1");
        return null;
    }
}
