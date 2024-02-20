package java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
        List<String> testList = Arrays.asList("test", "test1", "test2");
        Stream<String> test = testList.stream().filter(str -> !str.equals("test"));
        test.forEach(System.out::println);

//        map 기존 stream 을 변환하여 새로운 Stream 을 생성한다. function 인터페이스를 받는다.
        Stream<Integer> integerStream = testList.stream().map(String::length);
        integerStream.forEach(System.out::println);

//        sort 정렬을 사용할 수 있다 sorted 사용 Or comparator를 넘겨서 정렬 진행
        Stream<String> sorted = testList.stream().sorted();
        Stream<String> reverse = testList.stream().sorted(Comparator.reverseOrder());
        sorted.forEach(System.out::println);
        reverse.forEach(System.out::println);
//        distinct 중복 제거 equals 와 hashCode 를 override 해야 잘 사용 할 수 있다.

//        원시 stream to stream, mapToInt(), mapToLong(), mapToDouble()
        Stream<String> stringStream = IntStream.range(0, 10).mapToObj(range -> "test" + range);
        IntStream intStream = Stream.of("1", "2", "3").mapToInt(Integer::valueOf);

    }

}
