package java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

//        Consumer 종류로는 BiConsumer(2개 파라미터), IntConsumer, DoubleConsumer, LongConsumer 등의 여러 종류가 존재한다. 사용방안은 비슷하다.
//        Consumer 사용법
        Consumer<String> consumer = c -> System.out.println(c);
        consumer.accept("test");

//        Consumer에 andThen을 사용하여 연쇄적으로 처리도 가능하다.
        Consumer<String> chainConsumer = c -> System.out.println(c.length());
        chainConsumer.andThen((str) -> System.out.println(str)).accept("test");

    }
}
