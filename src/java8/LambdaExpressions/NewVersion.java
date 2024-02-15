package java8.LambdaExpressions;

import java.util.ArrayList;

public class NewVersion {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){{
            add("test");
            add("test1");
            add("test2");
            add("test3");
            add("test4");
        }};

        list.forEach(str -> System.out.println(str));
    }
}
