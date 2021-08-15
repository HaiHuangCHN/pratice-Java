package num;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class Num {
    @Test
    public void test1() {
        System.out.println(0.2 + 0.1);
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);
        System.out.println(5 / 2);
    }

    @Test
    public void test2() {
        BigDecimal bigDecimal = new BigDecimal(2);
        BigDecimal bDouble = new BigDecimal(2.3);
        BigDecimal bString = new BigDecimal("2.3");
        System.out.println("bigDecimal=" + bigDecimal);
        System.out.println("bDouble=" + bDouble);
        System.out.println("bString=" + bString);
    }

    @Test
    public void test3() {
        BigDecimal bDouble1 = BigDecimal.valueOf(2.3);
        BigDecimal bDouble2 = new BigDecimal(Double.toString(2.3));

        System.out.println("bDouble1=" + bDouble1);
        System.out.println("bDouble2=" + bDouble2);
    }

    @Test
    public void test4() {
        BigDecimal a = new BigDecimal("4.5");
        BigDecimal b = new BigDecimal("1.5");
        BigDecimal c = new BigDecimal("-1.5");

        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("a / b = " + a.divide(b));

        System.out.println("b - a = " + b.subtract(a));
        System.out.println("a + c = " + a.add(c));
}

    @Test
    public void test5() {
        BigDecimal bd = new BigDecimal("4.5635");

        bd = bd.setScale(3, RoundingMode.HALF_UP); // 保留3位小数，且四舍五入
        System.out.println(bd.toString());
    }

    @Test
    public void test6() {
        BigDecimal a = new BigDecimal("4.5");
        BigDecimal b = new BigDecimal("1.3");

        System.out.println("a / b =" + a.divide(b, 2, RoundingMode.HALF_UP));
    }

    @Test
    public void testRandomParameter() {
        System.out.println("Random 不含参构造方法：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("Random 含参构造方法：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random(50);
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println("");
        }
    }

    @Test
    public void test7() {
        Random random = new Random();
        for (int i = 1; i < 5; i++) {
            int a = random.nextInt(999);
            System.out.println(a);
        }
    }

    @Test
    public void test8() {
        Random random = new Random();
        for (int i = 1; i < 5; i++) {
            int a = random.nextInt(999);
            System.out.println(a);
        }
    }

    @Test
    public void test13() {
        double a = Math.random();
        System.out.println(a * 10);
    }

    @Test
    public void test9() {
        BigInteger big1 = new BigInteger("12345678909876543210");
        System.out.println(big1);
        BigInteger big2 = new BigInteger("98765432101234567890");
        System.out.println(big2);
        // add is like "+"
        BigInteger bigAdd = big1.add(big2);
        System.out.println(bigAdd);
        // subtract is like "-"
        BigInteger bigSub = big1.subtract(big2);
        System.out.println(bigSub);
        // multiply is like "*"
        BigInteger bigMul = big1.multiply(big2);
        System.out.println(bigMul);
        // divide is like "/"
        BigInteger bigDiv = big2.divide(big1);
        System.out.println(bigDiv);
    }

    @Test
    public void test10() {
        Double doubleNum = new Double("2.3546551654");
        BigDecimal bigDecimal = new BigDecimal("2.3546551654");
        System.out.println(doubleNum);
        System.out.println(bigDecimal);
    }

    @Test
    public void test11() {
        BigDecimal bd = new BigDecimal("12.335654644");
        System.out.println(bd.toString());
    }

    @Test
    public void test12() {
        BigDecimal bigDecimal = new BigDecimal("10000000000000000000000000000.00");
        System.out.println(bigDecimal.toPlainString());
        String temp = String.valueOf(bigDecimal);

        System.out.println(temp);
    }

    @Test
    public void test14() {
        Integer integer1 = new Integer(129);
        Integer integer2 = new Integer(129);
        System.out.println(integer1.compareTo(integer2));
    }

    @Test
    public void test15() {
        int i = 1;
        int j = 1;
        if (i == j) {
            System.out.println("1");
        }
    }

    @Test
    public void test16() {
        int i = 2;
        int j = 3;
        i += j;
        System.out.println(i);
    }

    @Test
    public void testEqual() {
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        Long u = new Long(9);
        System.out.println(s == t);
//        System.out.println(s == u);
//        System.out.println(t == u);
        System.out.println(s.equals(t));
        System.out.println(s.equals(u));
        System.out.println(t.equals(u));
    }

    @Test
    public void testEqualInteger() {
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        Integer a = 9;
        Long u = new Long(9);
        List<Integer> intList = new ArrayList<>();
        intList.add(s);

        System.out.println(intList.get(0) == t);
        System.out.println(s == t);
//        System.out.println(s == u);
//        System.out.println(t == u);
        System.out.println(s.equals(t));
        System.out.println(s.equals(9));
        System.out.println("s.equals(new Integer(\"9\")): " + s.equals(new Integer("9")));
        System.out.println(9 == s);
        System.out.println(s == a);
        System.out.println(s.equals(u));
        System.out.println(t.equals(u));
    }
}
