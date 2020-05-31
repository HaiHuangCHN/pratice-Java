package polymorphism;

// "abstract" can be omitted, and only public or (default) is allowed
public abstract interface Interface extends SuperInterface1, SuperInterface2 {

    // "public static final" can be omitted
    public static final String dataField = "dataField must be public static final";

//    @Override // TODO not able to add @Override, but why?
    public abstract String sameSuperInterfaceMethod();

    /**
     * "public abstract" can be omitted
     * 
     * @return
     */
    String interfaceMethod1();

}
