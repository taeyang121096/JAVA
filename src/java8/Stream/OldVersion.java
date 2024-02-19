package java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class OldVersion {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(){{
            add("test");add("test1");add("test2");add("test3");add("test4");
            add("test5");add("test6");add("test7");add("test8");add("test9");
        }};

        for(String str :  list){
            System.out.println(str);
        }
    }
}
