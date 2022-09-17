package generic;

public class Container<T> {

    private T variable;

    public Container() {
    }

    public Container(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

}