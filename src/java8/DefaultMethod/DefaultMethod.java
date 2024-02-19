package java8.DefaultMethod;

public interface DefaultMethod {

    default void test(String str){
        System.out.println(str);
    }

}
