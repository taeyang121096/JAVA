package skill.algorithm.level1;

import java.util.HashMap;
import java.util.Map;

public class Banding {

//    t sec -> 1sec +x
//    t sec -> +y
//    hp max 존재
//    공격 당할시 기술이 취소되며 붕대감기 연속 성공 시간이 0 sec
//    몬스터 공격 받을 시 -피해량
//    hp -> 0 죽음 -> -1 return
//    bandage -> 시전시간, 최대 회복량, 추가 회복량
//    health -> 최대 체력
//    attacks -> 공격시간 피해량 -> 2차원 배열

    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = bandage[0];
        int secHealth = bandage[1];
        int plusHealth = bandage[2];
        int lastTime = attacks[attacks.length-1][0];
        int nowHealth = health;

        int periodTime = time;
        Map<Integer, Integer> attackInfo = parseAttackToMap(attacks);

        for(int i = 1; i<= lastTime; i++){
            if(attackInfo.containsKey(i)){
                nowHealth -= attackInfo.get(i);
                time = bandage[0];
                if(nowHealth <= 0)
                    return -1;
            } else {
                nowHealth += secHealth;
                if(time == 1) {
                    nowHealth += plusHealth;
                    time = bandage[0];
                } else {
                    time--;
                }
                if(nowHealth > health)
                    nowHealth = health;
            }
        }

        answer = nowHealth;
        return answer;
    }

    public Map<Integer, Integer> parseAttackToMap(int[][] attacks){

        Map<Integer, Integer> attackInfo = new HashMap<>();

        for(int[] attack : attacks){
            attackInfo.put(attack[0], attack[1]);
        }
        return attackInfo;
    }

}
