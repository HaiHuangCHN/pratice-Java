package pattern;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author : Huang, Hai
 * @version ：Oct 9, 2019 5:07:19 PM
 */
public class PatternPratice {

    @Test
    public void test1() {
        Pattern p = Pattern.compile("\\w+");
        System.out.println(p.pattern());
    }

    @Test
    public void test2() {
        Pattern p = Pattern.compile("\\d+");
        String[] str = p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
    }

    @Test
    public void test3() {
        System.out.println(Pattern.matches("\\d+", "2223")); // 返回true
        System.out.println(Pattern.matches("\\d+", "2223aa")); // 返回false,需要匹配到所有字符串才能返回true, 这里aa不能匹配到
        System.out.println(Pattern.matches("\\d+", "22bb23")); // 返回false,需要匹配到所有字符串才能返回true, 这里bb不能匹配到 System.out.println(str[0]);
    }

    @Test
    public void test4() {
        System.out.println(Pattern.matches("\\d+", "2223")); // 返回true
        System.out.println(Pattern.matches("\\d+", "2223aa")); // 返回false,需要匹配到所有字符串才能返回true, 这里aa不能匹配到
        System.out.println(Pattern.matches("\\d+", "22bb23")); // 返回false,需要匹配到所有字符串才能返回true, 这里bb不能匹配到 System.out.println(str[0]);
    }

    @Test
    public void test5() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("22bb23");
        m.pattern();// 返回p 也就是返回该Matcher对象是由哪个Pattern对象的创建的
        System.out.println(m.pattern());
    }

    @Test
    public void test6() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("22bb23");
        System.out.println(m.matches());// 返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功.
        Matcher m2 = p.matcher("2223");
        System.out.println(m2.matches());// 返回true,因为\d+匹配到了整个字符串
    }

    @Test
    public void test7() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("22bb23");
        System.out.println(m.lookingAt());// 返回true,因为\d+匹配到了前面的22
        Matcher m2 = p.matcher("aa2223");
        System.out.println(m2.lookingAt());// 返回false,因为\d+不能匹配前面的aa
    }

    @Test
    public void test8() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("22bb23");
        System.out.println(m.find());// 返回true
        Matcher m2 = p.matcher("aa2223");
        System.out.println(m2.find());// 返回true
        Matcher m3 = p.matcher("aa2223bb");
        System.out.println(m3.find());// 返回true
        Matcher m4 = p.matcher("aabb");
        System.out.println(m4.find());// 返回false
    }

    @Test
    public void test9() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("TTL00KG1PC");
        System.out.println(m.find());// 匹配2223
        System.out.println(m.start());// 返回3
        System.out.println(m.end());// 返回7,返回的是2223后的索引号
        System.out.println(m.group());// 返回2223

        System.out.println("---------------------");

        Matcher m2 = p.matcher("2223bb");
        System.out.println(m2.lookingAt()); // 匹配2223
        System.out.println(m2.start()); // 返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0
        System.out.println(m2.end()); // 返回4
        System.out.println(m2.group()); // 返回2223

        System.out.println("---------------------");

        Matcher m3 = p.matcher("2223"); // 如果Matcher m3=p.matcher("2223bb"); 那么下面的方法出错，因为不匹配返回false
        System.out.println(m3.matches()); // 匹配整个字符串
        System.out.println(m3.start()); // 返回0
        System.out.println(m3.end()); // 返回3,原因相信大家也清楚了,因为matches()需要匹配所有字符串
        System.out.println(m3.group()); // 返回2223
    }

    @Test
    public void test10() {
        Pattern p = Pattern.compile("([a-z]+)(\\d+)");
        Matcher m = p.matcher("aaa2223bb");
        System.out.println(m.find()); // 匹配aaa2223
        System.out.println(m.groupCount()); // 返回2,因为有2组
        System.out.println(m.start(1)); // 返回0， 返回第一组匹配到的子字符串在字符串中的索引号
        System.out.println(m.start(2)); // 返回3
        System.out.println(m.end(1)); // 返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置.
        System.out.println(m.end(2)); // 返回7
        System.out.println(m.group(1)); // 返回aaa,返回第一组匹配到的子字符串
        System.out.println(m.group(2)); // 返回2223,返回第二组匹配到的子字符串
    }

    @Test
    public void test11() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    @Test
    public void test12() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while (m.find()) {
            System.out.println(m.group());
            System.out.print("start:" + m.start());
            System.out.println(" end:" + m.end());
        }

    }

    @Test
    public void test13() {
        Pattern p = Pattern.compile("cat|lion|tiger");
        Matcher m = p.matcher("one cat two cats three lions four tigers in the yard");
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String s = m.group();
            switch (s) {
            case "cat":
                m.appendReplacement(sb, "dog");
                System.out.println(sb.toString());
                break;
            case "lion":
                m.appendReplacement(sb, "giraffe");
                System.out.println(sb.toString());
                break;
            default:
                m.appendReplacement(sb, Matcher.quoteReplacement(s));
                System.out.println(sb.toString());
            }
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

    @Test
    public void test14() {
        String str1 = "...CX0*";
        String regx = "[^.*]+";
        System.out.println(str1.matches(regx));
    }

    @Test
    public void test16() {
        String str = "--";
        System.out.println(str.matches("(\\d+)-(\\d+)-(\\d+)"));
    }

}
