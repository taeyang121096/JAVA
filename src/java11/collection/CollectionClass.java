package java11.collection;

import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        //        of 로 초기화 가능
        List<String> test = List.of("test", "test1", "test2");
        test.forEach(System.out::println);
//        toArray 로 list to array 추가
        String[] array = test.toArray(String[]::new);
        for(String arr : array){
            System.out.println(arr);
        }
    }
}
