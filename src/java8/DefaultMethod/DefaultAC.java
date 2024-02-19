package java8.DefaultMethod;

public class DefaultAC implements DefaultA, DefaultC{

    public void test() {
        DefaultC.super.test();
    }
}
