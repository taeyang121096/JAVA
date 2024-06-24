package skill.algorithm.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastTwoElement {
//    정수 리스트 num_list가 주어질 때,
//    마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
//    마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {

        int[] num_list = new int[] {1,2,3};

        List<Integer> collect = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        int size = collect.size();
        int last = collect.get(size - 1);
        int semiLast = collect.get(size - 2);
        if(last > semiLast){
            collect.add(last - semiLast);
        } else {
            collect.add(last * 2);
        }
        int[] array = collect.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution(int[] num_list) {
//         마지막 > 마지막 - 1 -> 마지막 - (마지막-1)
//         not -> 마지막 * 2
        int[] answer = {};




        return answer;
    }
}
