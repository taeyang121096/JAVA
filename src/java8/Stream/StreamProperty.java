package java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProperty {

    public static void main(String[] args) {
//        1. 원본 데이터를 변경하지 않는다.
        List<String> list = new ArrayList<String>(){{
            add("test");add("test1");add("test2");add("test3");add("test4");
            add("test5");add("test6");add("test7");add("test8");add("test9");
        }};

        Stream<String> listStream = list.stream();
//         3. stream은 내부에 for 문과 같은 반복문이 숨어져 있어서 보다 간결한 코드 작성에 용이하다.
        List<String> collect = listStream.map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(collect);

//        2. stream은 일회성이다.
        long count = listStream.count();
        System.out.println(count);


    }
}
