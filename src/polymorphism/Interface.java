package polymorphism;

// "public abstract" can be omitted
public abstract interface Interface extends SuperInterface1, SuperInterface2 {

    // "public static final" can be omitted
    public static final String dataField = "dataField must be public static final";

    public abstract String method1();

    /**
     * "public abstract" can be omitted
     * 
     * @return
     */
    String method2();

}
