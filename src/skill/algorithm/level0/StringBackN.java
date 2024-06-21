package skill.algorithm.level0;

public class StringBackN {

    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 2;

//        문자열을 n 자리 만큼 뒤에서 자르는 법
        System.out.println(str.substring(str.length() - n));
    }
}
