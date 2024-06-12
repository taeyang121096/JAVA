public class Generic <E> {

    private E element;

    public Generic(E element) {
        this.element = element;
    }

    public Generic(){}

    public void set(E element) {
        this.element = element;
    }

    public E get() {
        return element;
    }

//    제네릭이 사용되는 메소드를 정적 메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독립적인 제네릭이 사용 되어야 한다.
    static <M> M genericGet(M method){
        return method;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "element=" + element +
                '}';
    }
}
