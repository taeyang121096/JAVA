package java11.stream;

import java8.Optional.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {
//        Predicate 에 not 부정 조건 추가
        List<String> test = List.of("test", "", " ", "test1");
        List<String> notBlank = test.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        notBlank.stream()
                .forEach(System.out::println);

//        var 예약어를 사용하여 지역 변수 타입 추론 가능하다.
//        메서드 내부의 변수 에만 적용 가능 -> 람다식에서도 var을 사용 할 수 있다.
        var str = "test!@3";
        var test3 = Test.getTest();
        System.out.println(str.getClass());
        System.out.println(test3.getClass());


    }
}
