package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class PraticeString {

    @Test
    public void test1() {
        List<String> a = new ArrayList<>();
        a.add("HuangHai");
        a.add("Unknown");
        StringBuilder ticket = new StringBuilder("a" + "b");
        System.out.println(ticket);
        ticket.append("Un");
        ticket.append("known");
        if (a.contains(ticket.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    @Test
    public void test() {
        String str1 = "1---Hai";
        String[] splitStr = str1.split("---");
        System.out.println(splitStr[0]);

        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        System.out.println(firstname);
        String familyname = scanner.next();
        System.out.println(familyname);

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println(name);
    }

    @Test
    public void test3() {
        String a = "   Huang, Hai";
        System.out.println(a.trim());
    }

    @Test
    public void test4() {
        String str = null;
        str = String.format("Hi,%s", "王力");
        System.out.println(str);
        str = String.format("Hi,%s:%s.%s", "王南", "王力", 1);
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3 > 7);
        System.out.printf("100的一半是：%d %n", 100 / 2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');

    }

    @Test
    public void test5() {
        List<String> a = new ArrayList<>();
        String str1 = "1";
        a.add(str1);
        a.add(null);
        System.out.println(a);
        System.out.println(a.size());
        if (a.size() > 0 && a != null) {
            System.out.println("End");
        }
    }

    @Test
    public void test7() {
        int startNum = 12345;
        String _startNum = String.format("%07d", startNum);
        System.out.println(_startNum);
    }

    @Test
    public void test8() {
        String str = "abcdef";
        System.out.println(str.indexOf("c"));
    }

    @Test
    public void test9() {
        String str = "12abCX034cd";
        System.out.println(str.matches("(.*)CX0(.*)"));
    }

    @Test
    public void test10() {
        Boolean str = null;
        if (str) {
            System.out.println("Hi");
        }
    }

    @Test
    public void test11() {
        String str = "000000001234034120";
        String newStr = str.replaceAll("^(0*)", "");
        System.out.println(newStr);
    }

    @Test
    public void test12() {
        String str = "0-0-0";
        System.out.println(str.matches("^(\\d+)-(\\d+)-(\\d+)$"));
    }

    @Test
    public void test_i_plus_plus() {
        int i = calI();
        System.out.println(i);
    }

    private int calI() {
        int i = 0;
        i++;
        ++i;
        return i++;
    }

    @Test
    public void test_null_equal_object() {
//        String a = "";
//        a = null;
//        if (a == "") {
//            System.out.println("if");
//        } else {
//            System.out.println("else");// run this
//        }

        // NullPointerException
        // null == primitive data type will cause error
        Integer a = 1;
        a = null;
        if (a == 1) {
            System.out.println("if");
        } else {
            System.out.println("else");
        }
    }

    @Test
    public void testReplace() {
        String abc = "abc";
        abc = abc.replace('b', 'd');
        System.out.println(abc);
    }
    
}
