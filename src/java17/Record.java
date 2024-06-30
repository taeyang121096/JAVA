package java17;

public class Record {

    public static void main(String[] args) {
        TestClass test1 = new TestClass(1, "tes1");
        TestClass test2 = new TestClass(2, "tset2");

        System.out.println(test1.equals(test2));
        TestClass copyTest1 = new TestClass(test1.getAge(), test1.getName());
        System.out.println(test1.equals(copyTest1));

//        Test2 test11 = new Test2(1, "test1");
//        Test2 test21 = new Test2(test11.age(), test11.name());
//        System.out.println(test11.equals(test21));
    }
}
