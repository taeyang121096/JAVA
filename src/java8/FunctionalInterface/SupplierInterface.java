package java8.FunctionalInterface;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

//        supplier  사용법 종류 : Boolean, Double, Int, Long 등이 있다.
        Supplier<String> supplier = () -> "test";
        System.out.println(supplier.get());

    }
}
