package java8.DefaultMethod;

public interface DefaultB extends DefaultA{

    default void test(){
        System.out.println("B");
    }
}
