package java8.Optional;

import java.util.Arrays;
import java.util.List;

public class Test {

    private String name;

    private Integer age;

    public static List<String> getList() {
        return Arrays.asList("test1", "test1","test1","test1");
    }

    public static Test getTest(){
        return new Test("test",12);
    }

    public Test(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
