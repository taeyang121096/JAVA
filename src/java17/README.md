# JAVA17

### 1. 텍스트 블록

    기존 JSON 문자열을 직접 생성할 때 불편했던 부분을 블록 처리로 편리하게 생성 가능하다.

### 2. Switch 표현식이 변경 되어졌다.

    기존의 switch의 경우 break 문 누락의 이슈와 가독성의 문제를 해결 하였다.

### 3. Record 추가

    롬복의 여러 기능을 Record를 사용하여 구현 가능하다.
    롬복 버전의 종속성이 생기는 경우를 개선 진행 하였다.
    Record로 선언 되어져 있는 클래스의 경우 불변 객체가 보장되어진다. (final 클래스로 프록시 객체 생성이 안되어진다는 점을 명심 해야한다.)

### 4. Instanceof 변수 생성 가능

    instanceof 체크 시 변수 생성이 가능하여 새로운 변수를 생성하여 캐스팅을 할 필요가 없어졌다.

### 5. 기타 추가

    - httpclient 정식 통합 및 성능이 향상 되었다.
    - javac을 통해 컴파일 하지 않고 바로 실행 가능 해졌다
    - G1 GC 알고리즘 성능 향상 (default 는 G1 GC를 사용한다. java8 Parallel GC)
        1. stop the world시 Mark-Sweep 알고리즘의 수행을 단일 스레드에서 병렬 스레드로 변경
        2. GC의 stop the world를 최소화하는 ZGC가 나왔다.


### __추가적으로 java8 과 java11은 큰 차이가 없어서 버전 업그레이드 해도 side effect가 적다.__
    