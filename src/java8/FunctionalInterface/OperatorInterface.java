package java8.FunctionalInterface;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;

public class OperatorInterface {

    public static void main(String[] args) {
//        Operator 사용법 종류 :  Binary, Double, Int 등이 존재한다.
        IntBinaryOperator operator = (x, y) -> x + y;

        System.out.println(operator.applyAsInt(10, 10));

    }
}
