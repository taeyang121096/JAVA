package skill.algorithm.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestPresent {


//    ["muzi", "ryan", "frodo", "neo"]
//    ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi",
//    "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"]

    //     이번달 a > b -> 다음달 b가 a 에게 선물 1나 줘야됨
//     기록 x or a = b -> 선물 지수가 더큰 사람에게 선물 1나 줘야 됨
//     선물 지수 = 준선물 - 받은 선물 (전체)
//     위의 조건이 동일 할 경우 선물 주고 받지 않음
//      return 선물을 가장 많이 받을 친구의 선물의 수
//     friends 친구
//     gifts 선물 기록 -> a,b -> a 는 선물을 준 친구의 이름, b는 선물을 받은 친구의 이름
//    map 을 사용해서 이름 별 muzi -> frodo 2번 줌, ryan 3번 받음, frodo 2번 받음, neo 1번 받음
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        Map<String, Integer> rate = new HashMap<>();
        Map<String, Map<String, Integer>> sendReport = new HashMap<>();

        for(String me : friends) {
            rate.put(me,0);
            sendReport.put(me, new HashMap<>());
            for(String friend : friends){
                if(!friend.equals(me)) {
                    Map<String, Integer> contents = sendReport.get(me);
                    contents.put(friend, 0);
                    sendReport.put(me, contents);
                }
            }
        }

        for(String gift : gifts) {
            String[] s = gift.split(" ");
            String send = s[0];
            String receive = s[1];
            rate.put(send, rate.get(send) + 1);
            rate.put(receive, rate.get(receive) - 1);
            Map<String, Integer> sendContent = sendReport.get(send);
            sendContent.put(receive, sendContent.get(receive) + 1);
        }
        System.out.println(sendReport);
        System.out.println("+++++++++++++++++++++");
        System.out.println(rate);

        for(String friend : friends){
            int sum = 0;
            Map<String, Integer> receives = sendReport.get(friend);
            for (String key : receives.keySet()) {
                int sendCount = receives.get(key);
                int receiveCount = sendReport.get(key).get(friend);

                if(sendCount > receiveCount){
                    sum += 1;
                } else if(sendCount == receiveCount) {
                    if (rate.get(friend) > rate.get(key)) {
                        sum += 1;
                    }
                }

            }
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
