package java8.FunctionalInterface;

import java.util.function.IntBinaryOperator;

public class CustomFunctionClass {
    public static void main(String[] args) {
//          custom functional interface 사용법
        CustomFunction customFunction = (int x, int y) -> x + y;
        int sum = customFunction.sum(20, 20);
        System.out.println(sum);

    }
}
