package java8.FunctionalInterface;

// 해당 어노테이션을 사용하면 컴파일전에 함수형 인터페이스를 잘못 설계한지 알 수있다.
@FunctionalInterface
public interface CustomFunction {
    int sum(int x, int y);
}
