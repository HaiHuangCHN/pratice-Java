package polymorphism;

public interface SuperInterface2 {

    String sameSuperInterfaceMethod();

    public static String superInterfaceStaticMethod() {
        System.out.println("SuperInterface2 static method1");
        return null;
    }

    default String superInterfaceNonStaticMethod() {
        System.out.println("SuperInterface2 non-static method2");
        return null;
    }

}
