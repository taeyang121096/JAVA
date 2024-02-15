package java8.LambdaExpressions;

import java.util.function.Consumer;

public class FirstClassObject {

    public static void testLambda(Consumer<String> testConsumer, String str){
        testConsumer.accept(str);
    }

    public static Consumer<String> returnLambda(){
        return (lambda) -> System.out.println(lambda);
    }

    public static void main(String[] args) {

//        1. 변수나 데이터를 담을 수 있어야 한다.
        Consumer<String> testConsumer = (lambda) -> System.out.println(lambda);
        testConsumer.accept("test");

//        2. 함수의 파라미터로 전달 할 수 있어야 한다.
        testLambda((lambda) -> System.out.println(lambda), "test");

//        3. 함수의 리턴값으로 사용 할 수 있어야 한다.
        Consumer<String> testLambda = returnLambda();
        testLambda.accept("test");


    }
}
