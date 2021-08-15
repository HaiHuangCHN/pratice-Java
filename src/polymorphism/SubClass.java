package polymorphism;

public class SubClass extends SuperClass {

    private String a = "B";

    /**
     * @return
     */
    public String getString() {
        return super.a + super.a;
    }

}
