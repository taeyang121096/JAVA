package java8.DefaultMethod;

public class DefaultClass implements DefaultMethod{

    public static void main(String[] args) {
//        Default method 사용법
        new DefaultClass().test("test");
//        1. class Override가 우선순위를 갖는다.
        new DefaultAClass().test();
//        2. sub Interface가 우선순위를 갖는다.
        new DefaultABClass().test();
//        3. 명시적 호출이 필요하다.
        new DefaultAC().test();
    }
}
