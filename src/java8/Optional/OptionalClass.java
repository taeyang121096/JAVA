package java8.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
//        Wrapper 클래스여서 아무 값이 없을 경우 empty로 생성 가능하다.
        Optional<Object> empty = Optional.empty();
//        무조건 값이 존재 할 때
        Optional<String> notNull = Optional.of("test");
//        값이 있을 수도 있고 없을 수도 있을 때
        String str = "test";
        Optional<String> nullAble = Optional.ofNullable(str);

//        예전 버전
        List<String> list = Test.getList() != null ? Test.getList() : new ArrayList<>();
        Test test = Test.getTest();
        if(test != null){
            if (test.getName() != null){
                if (test.getAge() != null){

                }
            }
        }


//        Optional 버전
        List<String> list1 = Optional.ofNullable(Test.getList()).orElseGet(() -> new ArrayList<>());

        Optional<Test> test1 = Optional.ofNullable(Test.getTest());
        Optional<String> name = test1.map(Test::getName);
        Optional<Integer> age = test1.map(Test::getAge);

//        Npe 처리의 경우
        Optional<Test> test2 = Optional.ofNullable(Test.getTest());
        Test test3 = test2.orElseThrow(NullPointerException::new);

//        orElse, orElseGet -> orElse는 파라미터로 값을 필요로 한다. orElseGet 함수형 인터페이스를 파라미터로 갖는다.

        Optional<Test> test4 = Optional.ofNullable(Test.getTest());
        Optional<Test> test5 = Optional.empty();
        Optional<Object> em = Optional.empty();
        System.out.println(test4.orElse(null).getAge());
        System.out.println(test5.orElseGet(Test::getTest).getAge());

        try {
            em.orElseThrow(NullPointerException::new);
        }catch (Exception e){
            System.out.println(e.getClass());
        }


    }
}
