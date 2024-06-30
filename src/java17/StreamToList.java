package java17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        Stream<String> test = Stream.of("test1", "test2", "test3");
        List<String> strings = test.collect(Collectors.toList());
        System.out.println(strings);
    }
}
