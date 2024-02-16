package java8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
//          Predicate 사용법 종류 : Bi, Double, Int, Long등이 있다.
        Predicate<String> predicate = (p) -> p.equals("test");
        System.out.println(predicate.test("test"));

    }
}
