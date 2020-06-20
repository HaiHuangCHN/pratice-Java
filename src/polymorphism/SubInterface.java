package polymorphism;

// "abstract" can be omitted, and only public or (default) is allowed
public abstract interface SubInterface extends SuperInterface1, SuperInterface2 {

    // "public static final" can be omitted
    public static final String DATA_FIELD = "DATA_FIELD must be public static final";

    // When there are 2 methods with same signature. Which one will be extended
    // actually?
    // Will be the first Interface in class definition
    @Override
    public abstract String overrideSuperInterface12Method();

    /**
     * "public abstract" can be omitted
     * 
     * @return
     */
    String subInterfaceMethod1();

}
