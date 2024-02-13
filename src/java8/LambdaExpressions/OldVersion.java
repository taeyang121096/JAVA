package java8.LambdaExpressions;

import java.util.ArrayList;

public class OldVersion {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("test");
            add("test1");
            add("test2");
            add("test3");
            add("test4");
        }};

        for(String str : list){
            System.out.println(str);
        }

        
    }
}
