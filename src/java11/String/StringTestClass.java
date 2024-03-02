package java11.String;

import java.util.List;

public class StringTestClass {
    public static void main(String[] args) {
        String str = " test ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());
        System.out.println(str.isBlank());
        System.out.println(str.repeat(10));
        "test\ntest1".lines().
                forEach(System.out::println);

        List<String> test = List.of("test", "test1");
        test.forEach((s) -> {
            System.out.println(s);
            return;
        });
    }
}
