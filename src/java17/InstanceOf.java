package java17;

public class InstanceOf {
    public static void main(String[] args) {
        Object o = new Test2(1, "name");

        if (o instanceof Test2){
            Test2 test = (Test2) o;
            System.out.println(test.name());
        }

        if (o instanceof Test2 test2){
            System.out.println(test2.name());
        }

    }
}
