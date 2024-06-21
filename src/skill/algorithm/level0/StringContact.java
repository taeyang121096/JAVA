package skill.algorithm.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringContact {

    public static void main(String[] args) {
        String str = "123";
        String str2 = "456";

        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        String concat = str.concat(str2);
        System.out.println(concat);
    }

    public String solution1(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }

    public String solution2(String myString, int[] indexList) {
        return Arrays.stream(indexList)
                .mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    }
}
