package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class LambdaTest {
    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Collections.sort(list, (x, y) -> x - y);
    }

    @Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java", "scala", "python");
        // Before java8
        System.out.println("Before java8:");
        for (String each : languages) {
            System.out.println(each);
        }
        // After java8
        System.out.println("After java8: (way 1)");
        languages.forEach(x -> System.out.println(x));
        System.out.println("After java8: (way 2)");
        languages.forEach(System.out::println);
    }

    @Test
    public void mapTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        Stream<Double> stream1 = cost.stream();
        Stream<Double> stream2 = stream1.map(x -> x + x * 0.05);
        stream2.forEach(x -> System.out.println(x));
        // Or in the following way:
        cost.stream().map(x -> x + x * 0.05).forEach(x -> System.out.println(x));
    }

    @Test
    public void mapReduceTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        double allCost = cost.stream().map(x -> x + x * 0.05).reduce((sum, x) -> sum + x).get();
        System.out.println(allCost);
    }

    @Test
    public void filterTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));
    }

    @Test
    public void test3() {
        List<String> languages = Arrays.asList("Java", "Python", "scala", "Shell", "R");
        System.out.println("Language starts with J: ");
        filterTest1(languages, x -> x.startsWith("J"));
        System.out.println("\nLanguage ends with a: ");
        filterTest2(languages, x -> x.endsWith("a"));
        System.out.println("\nAll languages: ");
        filterTest2(languages, x -> true);
        System.out.println("\nNo languages: ");
        filterTest2(languages, x -> false);
        System.out.println("\nLanguage length bigger three: ");
        filterTest2(languages, x -> x.length() > 4);
    }

    public static void filterTest1(List<String> languages, Predicate<String> condition) {
        for (String language : languages) {
            if (condition.test(language)) {
                System.out.println(language + " ");
            }
        }
    }

    public static void filterTest2(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.println(x + " "));
    }

    @Test
    public void test4() {
        List<String> originalNumbers = new ArrayList<String>();
        originalNumbers.add("A");
        originalNumbers.add("B");
        List<String> exclutedNumbers = new ArrayList<String>();
        exclutedNumbers.add("B");
        exclutedNumbers.add("D");
        boolean result = originalNumbers.removeIf((x) -> exclutedNumbers.contains(x));
        System.out.println(result);
        System.out.println(originalNumbers.toString());
        System.out.println(exclutedNumbers.toString());
    }

    @Test
    public void test5() {
        List<String> eligiblePidsLeft = new ArrayList<String>();
        eligiblePidsLeft.add("1");
        eligiblePidsLeft.add("2");
        eligiblePidsLeft.add("3");
        eligiblePidsLeft.add("4");
        eligiblePidsLeft.removeIf(x -> "3".equals(x));
        System.out.println(eligiblePidsLeft);
    }

    @Test
    public void test6() {
        List<String> associatedSsrOtNumList = new ArrayList<String>();
        associatedSsrOtNumList.add("4");
        associatedSsrOtNumList.add("7");

        List<String> bookedSsrOtNum = new ArrayList<String>();
        bookedSsrOtNum.add("3");
        bookedSsrOtNum.add("4");
        bookedSsrOtNum.add("5");
        bookedSsrOtNum.add("6");

        if (associatedSsrOtNumList.stream().anyMatch(x -> bookedSsrOtNum.contains(x))) {
            System.out.println("1");
        }
    }

    @Test
    public void test7() {
        List<String> bookedSsrOtNum = new ArrayList<String>();
        bookedSsrOtNum.add("Red");
        bookedSsrOtNum.add("Blue");
        bookedSsrOtNum.add("Green");
        List<String> colors = bookedSsrOtNum.stream().filter(c -> c.length() > 4).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(colors);
    }

}
