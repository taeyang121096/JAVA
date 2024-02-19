# JAVA8


### 1. Lambda expression (람다 표현식)
    * 함수형 프로그래밍 패러다임 : 함수의 입력만을 의존하여 출력을 만드는 구조로, 외부에서 상태를 변경 하는 것을 지양하는 패러다임이다.
    * 일급 객체 : 하기의 3가지 조건을 충족 해야 한다.
        1. 일급 객체는 변수나 데이터를 담을 수 있어야한다.
        2. 일급 객체는 함수의 파라미터로 전달 할 수 있어야한다.
        3. 일급 객체는 함수의 리턴값으로 사용 할 수 있어야 한다.

    람다란 이름이 없는 함수를 말합니다. (익명함수)라고 할 수 있습니다.
    기본적인 표현식의 경우 (parameters) -> expression
    
    * 특징
        - 람다식 내에서 사용되는 지역 변수의 경우 final이 없어도 상수이다.
        - 람다식으로 선언되어진 변수 명은 중복 될 수 없다.
    * 장점 
        - 코드 간결성
        - 가독성 좋음
        - 함수를 만드는 과정이 없으므로 생산성 증가
        - 병렬 프로그래밍 용이 함
    * 단점
        - 디버깅이 어려움
        - 람다를 남발 할 경우 중복 코드 생성 되어짐
        - 재귀로 만들 경우 복잡도 증가
    
```java
    1. () -> new Object()
    2. (String s) -> s.length()
    3. (int a, int b) -> a*b
```
    
### 2. Functional interface (함수형 인터페이스)
    * 함수형 인터페이스는 추상메서드가 1개만 정의 된 인터페이스를 의미한다.

    함수적 인터페이스 표준 API 는 java.util.function 패키지로 제공된다.
    종류로는 Consumer, Supplier, Function, Operator, Predicate 가 있다.
    그 외로 직접 함수형 인터페이스를 생성 할 경우 @FunctionalInterface를 사용 해주면 된다.(꼭 해당 어노테이션 안붙여도 된다. 인터페이스 생성 편의 및 가독성을 높이기 위한 어노테이션)

| 함수형 인터페이스        | 메서드               | 활용 방안                                | 파라미터 | 리턴 값 |
|------------------|-------------------|--------------------------------------|------|------|
| Consumer`<T>`    | void accept(T t)  | 매개변수를 사용만 하고 return 존재 x             | O    | X    |
| Supplier`<T>`    | T get()           | 매개 변수 사용안하고 return 존재 o              | X    | O    |
| Function`<T, R>` | R apply(T t)      | 매개 변수를 타입 변경을 해서 return o            | O    | O    |
| Predicate`<T>`   | boolean test(T t) | 매개 값이 조건에 맞는지 확인 후 boolean return o  | O    | O    |
| Operator         | R applyAs(T t)    | 매개 값을 연산하여 return o                  | O    | O    |

    
### 3. Default method (디폴트 메소드)
    Interface에서 Method 구현이 가능해졌다.(추상 메소드만 사용 가능 했음)
    * 다중 상속 문제의 우선순위의 경우
        1. 클래스에서 정의한 Method가 항상 우선순위를 갖는다.
        2. 클래스가 아닌경우 sub Interface Method가 실행 되어진다.
        3. 그 외에는 해당 class에서 명시적으로 호출을 해야 한다. (super.method())
### 4. Stream (스트림)
### 5. Optional (옵션널)
### 6. Date Time Package (새로운 날짜 API)
### 7. JVM 변화 
