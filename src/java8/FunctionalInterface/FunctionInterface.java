package java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
//        Function 사용법 종류: Bi, Double, Int, IntToDouble 등의 종류가 있다.
//        Function은 andThen 뿐 아니라 compose가 존재한다. compose의 경우 첫 함수 실행 전에 실행을 시켜준다.
//        또한 identity라는 static 함수를 갖으며 해당 함수는 자기 자신을 return 해준다.

        Function<String, Integer> function = f -> f.length();
        System.out.println(function.apply("test"));
    }
}
