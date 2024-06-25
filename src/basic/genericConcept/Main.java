package basic.genericConcept;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Generic<String> generic = new Generic<>();

        generic.set("test");
        System.out.println(generic.get());

        List<Generic<String>> list = new ArrayList<>();

        list.add(new Generic<>("1"));
        list.add(new Generic<>("2"));
        list.add(new Generic<>("3"));

        System.out.println(list);
    }
}
