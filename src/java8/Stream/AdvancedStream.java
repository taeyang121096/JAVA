package java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdvancedStream {
    public static void main(String[] args) {
//        flatmap -> 2중 컬렉션, 배열을 1차원 Stream 으로 변경 해준다.
        String [][] strs = {{"test3","test2","test1"},
                {"abd1", "abd2", "abd3"}
        };
        Stream<Stream<String>> streamStream = Arrays.stream(strs).map(Arrays::stream);
        Stream<String> stringStream = Arrays.stream(strs).flatMap(Arrays::stream);

//        reduce  -> 1. accumulator 2. identity 3. combiner(병렬처리시 사용) 를 파라미터로 받을 수 있다.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list.stream().reduce(Integer::sum).get());
//        parallel
        List<String> parallel = Arrays.asList("a", "b", "c", "d", "e");
        parallel.parallelStream()
                .map(a -> {
                    System.out.println("지금 문자 :" + a+ ">>" + Thread.currentThread().getName());
                    return a.toUpperCase();
                }).sorted((a1,a2) -> {
                    System.out.println("정렬 문자" + a1 +":"+a2+">>"+Thread.currentThread().getName());
                    return a1.compareTo(a2);
                }).forEach(a -> System.out.println("마지막 : "+ a +">>∑" + Thread.currentThread().getName()));
    }

}
