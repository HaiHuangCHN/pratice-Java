package polymorphism;

public interface SuperInterface2 {

    String sameSuperInterfaceMethod();

    // since JDK 1.8
    public static String superInterface2StaticMethod() {
        System.out.println("SuperInterface2 static method1");
        return null;
    }
}
