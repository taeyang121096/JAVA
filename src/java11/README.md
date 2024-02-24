# JAVA11

### 1. 컬렉션을 쉽게 구성 

    List 와 같은 컬렉션을 Lis t.of()와 같은 방법으로 초기화가 편해졌다.

### 2. String & File 메서드 추가

    - 문자열을 다루는 메서드가 추가되어졌다.
    - 파일을 읽고 쓰는게 편해졌다.
### 3. Stream 추가 메서드
    
    - Predicate 인터페이스에 not 메서드 추가 되어짐
    - 람다에서 var 변수 사용 가능

### 4. 변수 유형 추론 var 키워드 도입

    var을 사용해서 타입을 추론할 수 있는 키워드가 도입 되어졌다.
    (단 지역 변수에서만 사용 가능)

### 5. 기타 추가
    
    - httpclient 정식 통합 및 성능이 향상 되었다.
    - javac을 통해 컴파일 하지 않고 바로 실행 가능 해졌다
    - G1 GC 알고리즘 성능 향상 (default 는 G1 GC를 사용한다. java8 Parallel GC)
        1. stop the world시 Mark-Sweep 알고리즘의 수행을 단일 스레드에서 병렬 스레드로 변경
        2. GC의 stop the world를 최소화하는 ZGC가 나왔다.


### __추가적으로 java8 과 java11은 큰 차이가 없어서 버전 업그레이드 해도 side effect가 적다.__
    