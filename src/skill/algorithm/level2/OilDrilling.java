package skill.algorithm.level2;

public class OilDrilling {

//      1 ≤ land의 길이 = 땅의 세로길이 = n ≤ 500
//      1 ≤ land[i]의 길이 = 땅의 가로길이 = m ≤ 500
//      land[i][j]는 i+1행 j+1열 땅의 정보를 나타냅니다.
//      land[i][j]는 0 또는 1입니다.
//      land[i][j]가 0이면 빈 땅을, 1이면 석유가 있는 땅을 의미합니다.
//      정확성 테스트 케이스 제한사항
//      1 ≤ land의 길이 = 땅의 세로길이 = n ≤ 100
//      1 ≤ land[i]의 길이 = 땅의 가로길이 = m ≤ 100
//      효율성 테스트 케이스 제한사항
//      주어진 조건 외 추가 제한사항 없습니다.

//    [0, 0, 0, 1, 1, 1, 0, 0],
//    [0, 0, 0, 0, 1, 1, 0, 0],
//    [1, 1, 0, 0, 0, 1, 1, 0],
//    [1, 1, 1, 0, 0, 0, 0, 0],
//    [1, 1, 1, 0, 0, 0, 1, 1]


    public int solution(int[][] land) {
        int answer = 0;
        int rowNum = land.length;
        int colNum = land[0].length;
        int [][] checkMap;

        for(int col = 0; col < colNum; col++){
            checkMap = new int[rowNum][colNum];
        }

        return answer;
    }
}
