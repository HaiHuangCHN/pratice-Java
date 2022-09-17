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

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<String>();
        stringContainer.setVariable("this is a string");
        System.out.println(stringContainer.getVariable());

    }
}