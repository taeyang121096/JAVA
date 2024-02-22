package java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStream {

    public static void main(String[] args) {
//       collection to stream
        List<String> list = Arrays.asList("test", "test1", "test2");
        Stream<String> listStream = list.stream();

//        array to stream
        Stream<String> stream = Stream.of("test", "test1", "test2");
        Stream<String> stream1 = Arrays.stream(new String[]{"test", "test1", "test2"});

//        원시 stream 0 <= x <= 10 종류 : IntStream, DoubleStream, LongStream 등이 있다.
        IntStream rangeStream = IntStream.range(0, 10);

//        필터링 predicate 사용, 해당 조건의 참인 값만 필터링 한다.
        System.out.println("==========filter==========");
        List<String> testList = Arrays.asList("test", "test1", "test2");
        Stream<String> test = testList.stream().filter(str -> !str.equals("test"));
        test.forEach(System.out::println);
        System.out.println("==========filter==========");

//        map 기존 stream 을 변환하여 새로운 Stream 을 생성한다. function 인터페이스를 받는다.
        System.out.println("==========map==========");
        Stream<Integer> integerStream = testList.stream().map(String::length);
        integerStream.forEach(System.out::println);
        System.out.println("==========map==========");

//        sort 정렬을 사용할 수 있다 sorted 사용 Or comparator를 넘겨서 정렬 진행
        System.out.println("==========sort==========");
        Stream<String> sorted = testList.stream().sorted();
        Stream<String> reverse = testList.stream().sorted(Comparator.reverseOrder());
        sorted.forEach(System.out::println);
        reverse.forEach(System.out::println);
        System.out.println("==========sort==========");
//        distinct 중복 제거 equals 와 hashCode 를 override 해야 잘 사용 할 수 있다.

//        원시 stream to stream, mapToInt(), mapToLong(), mapToDouble()
        Stream<String> stringStream = IntStream.range(0, 10).mapToObj(range -> "test" + range);
        IntStream intStream = Stream.of("1", "2", "3").mapToInt(Integer::valueOf);

//        최종 연산 max, min, sum, avg, count
//        max, min, avg 의 경우 값이 없을 때 추정이 불가하여 Optional로 반환
        System.out.println("==========min,max~==========");
        OptionalInt max = IntStream.of(1, 2, 3, 4).max();
        System.out.println(max.orElse(0));
        OptionalInt min = IntStream.of(1, 2, 3, 4).min();
        System.out.println(min.orElse(0));
        OptionalDouble average = IntStream.of(1, 2, 3, 4).average();
        System.out.println(average.orElse(0));

        long count = IntStream.of(1, 2, 3, 4).count();
        System.out.println(count);
        int sum = IntStream.of(1, 2, 3, 4).sum();
        System.out.println(sum);
        System.out.println("==========min,max~==========");

//        collect stream 요소들을 Collection 으로 변환이 가능 하다.
//        그 외의 문자열 붙이기, 총합 구하기 등 또한 구현 가능 하다.
        System.out.println("==========collect==========");
        List<Integer> collectList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> collectStringList = collectList.stream().map(String::valueOf)
                .collect(Collectors.toList());

        String join = collectStringList.stream().collect(Collectors.joining(",", "<", ">"));
        System.out.println(join);

        IntSummaryStatistics collectSumInfo = collectStringList.stream().collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println(collectSumInfo);

//        groupingBy, partitioningBy 도 존재한다.
        System.out.println("==========collect==========");

        System.out.println("==========match==========");
        List<String> match = Arrays.asList("test", "test1", "test2", "test34");
        System.out.println(match.stream().anyMatch(t -> t.contains("34")));
        System.out.println(match.stream().allMatch(t -> t.contains("test")));
        System.out.println(match.stream().noneMatch(t -> t.contains("lee")));
        System.out.println("==========match==========");







    }

}
