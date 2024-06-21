package skill.algorithm.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CountUp {
    public static void main(String[] args) {

    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i = start_num; i <= end_num; i++)
            list.add(i);

        int[] array = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public int[] solution2(int start, int end) {

        return IntStream.rangeClosed(start, end).toArray();
    }
}
