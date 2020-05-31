package string;

import org.junit.Test;

public class StringBuilderPratice {

    @Test
    public void test1() {
        StringBuilder ticket = new StringBuilder();
        System.out.println(ticket);
        ticket.append("Hai");
        String b = ticket.substring(1, 2);
        String a = ticket.toString();
        if (b.equals("a")) {
            System.out.println("True");
        } else
            System.out.println("False");
    }

    @Test
    public void test2() {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        appendAAndB(a, b);
        System.out.println("a: " + a + ", b: " + b);
    }

    private void appendAAndB(StringBuilder a, StringBuilder b) {
        a.append(b);
        a = b;
        a.append("C");
    }

}
