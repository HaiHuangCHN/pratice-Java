package polymorphism;

public interface SuperInterface1 {

    String superInterface1Method1();

    // since JDK 1.8
    public static String method1() {
        System.out.println("SuperInterface1 static method1");
        return null;
    }
}
