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

    * 메소드 참조 : 함수형 인터페이스를 람다식이 아닌 일반 메소드를 참조하여 선언하는 방법
        - 함수형 인터페이스의 매개변수 타입 = 메소드의 매개변수 타입
        - 함수형 인터페이스의 매개변수 개수 = 메소드의 매개변수 개수
        - 함수형 인터페이스의 반환형 = 메소드의 반환형
    참조가능한 메소드는 일반 메소드, Static 메소드, 생성자가 있으며 클래스이름::메소드이름


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

    * 번외로 static method도 정의 할 수 있다.
### 4. Stream (스트림)
    스트림이란 '데이터의 흐름' 입니다. 배열 또는 컬렉션 인스턴스에 함수를 사용하여 데이터를 가공 할 수 있다. 
    람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있으며, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.
    * JAVA의 경우 객체 지향 언어이므로 함수형 프로그래밍이 불가능 하지만, Stream API, 람다, 함수형 인터페이스 를 통하여 함수형 프로그래밍을 지원한다.
    Stream API는 데이터를 추상화하고, 처리하므로 재상용성이 높다.

    * Stream API 특징
        1. Stream은 데이터를 변경하지 않는다.(데이터를 읽기만 할 뿐 원본데이터 변경 X)
        2. Stream은 일회용이다.
        3. Stream은 작업을 내부 반복으로 처리한다.

    * Stream API의 3가지 단계
        1. Stream 객체를 생성한다. (생성)
        2. 원본의 데이터를 별도의 데이터로 가공 (가공)
        3. 가공된 데이터 로부터 원하는 결과 만들기 최종연산 (결과)

    * Stream API 실행 순서 
        - 수평적 구조가 아닌 수직적 구조로 실행한다.

    * 병렬 Stream
        - 내부적으로 Fork & join(work-stealing) 형식을 사용하고 있다.



### 5. Optional (옵션널)
    null이 올 수 있는 값을 감싸는 Wrapper 클래스이다.

    * Optionial은 static 변수로 empty 객체를 가지고 있어 메모리를 절약한다.
    * 결과가 null이 될 수 있으며, null에 의해 오류가 발생할 가능성이 매우 높을 때 반환값으로만 사용되어야 한다.(함수 등이 존재하여 오버헤드 존재한다.)
        - NPE,NoSuchElementException
    * Optional은 지극히 반환 타입을 위해 구성되어져 있다.
    * Optional은 null을 반환하면 오류가 발생할 경우에 결과 없음을 명확히 나나태기 위해 필요로 한 것이다.(stream api 체이닝 용으로 탄생)
    * 기본적으로 Optional은 직렬화를 지원하지 않는다(요즘은 지원을 많이 하긴 하지만 굳이..?)

    - 사용시 이점을 볼 수 있는 방향
        1. Optional 변수에 Null대입 X
        2. orElseGet을 기본으로 사용
        3. 단순히 값을 얻으려는 목적으로만 Optional을 사용하지 마라
        4. 생성자, 수정자, 메소드 파라미터 등으로 Optional을 넘기지 마라
        5. Collection의 경우 Optional이 아닌 빈 Collection을 사용하라
        6. 반환 타입으로만 사용하라

    
### 6. Date Time Package (새로운 날짜 API)

    java8 이전의 날짜와 시간들에 대해서 우선 알아볼 필요가 있다.
    - 전에 주로 사용한 java 기본 날짜 시간 클래스의 경우 java.util.Date, java.util.Calendar, java.text.SimpleDateFormat 등의 클래스를 사용하였다.
      해당 클래스들은 3가지 정도의 대표적 이슈를 가지고 있는데
        1. mutable 객체여서 thread safe 하지 않았다.
        2. 클래스의 작명이 잘 되어 있지 않았다 -> Date 클래스에서 시간까지 확인 가능했다.
        3. 파라미터로 숫자도 들어갈 수 있으며 type safe 하지 않아서 헷갈렸다.
        4. 추가적으로 일관성 없는 요일 상수를 확인 할 수 있다.

#### __따라서 java8 이전에는 주로 Joda-Time 이라는 라이브러를 사용하였다.__

    java8 Date-Time API
        
    * API들이 명확해 졌다.
    * immutable 해졌다. -> 인스턴스 값이 변경 되어지는게 아니라 새로운 인스턴스가 나온다는 뜻이다.
    * null을 반환하는 메소드가 없기에 계속해서 체이닝이 가능해졌다.
    * DateTimeFormatter를 이용하여 일시를 특정한 문자열로 formatting 할 수 있다.
    
    - 추가 되어진 클래스 (타임존 : 동일한 로컬 시간을 따르는 지역, 해당 국가에 의해 법적으로 지정되어있다.)
        * java.time.LocalDate - 타임존 사용하지 않음.
        * java.time.LocalTime - 타임존 사용하지 않음.
        * java.time.LocalDateTime - 타임존 사용하지 않음.
        * java.time.ZonedDateTime - 타임존 사용.
        * java.time.DateTimeFormatter - java.time에 대한 형식
        * java.time.Duration - 초 단위
        * java.time.Period - 년, 월 일
        * java.time.TemporalAdjuster - 날짜 조정

### 7. JVM 변화 

    * PermGen 영역이 -> Metaspace 영역으로 변경 되어졌다 (jvm 옵션을 줄 때도 고려해야 한다.)
        - PermGen 영역은 클래스의 메타정보(클래스 이르, 어노테이션 정보, static 필드 클래스 구성 정보)를 관리하는 메모리이다.

    PermGen은 Heap 메뢰에 포함되어 있어서 클래스가 많은 어플리케이션의 경우 oom이 발생 할 때도 있엇다.
    Metaspace의 경우 Native영역에 새롭게 생성이 되었으며 OS가 크기를 자동으로 조절 한다.
    옵션 : (-XX:MaxMetaspaceSize=N)

### __Metaspace 의 경우 메모리가 가변적으로 늘어남으로 최대값을 설정 해주는게 좋다.__
    
