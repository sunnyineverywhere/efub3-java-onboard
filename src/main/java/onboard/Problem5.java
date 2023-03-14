package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        int money = K;

        for(int i=N-1; i>=0; i--){
            answer += money/values[i];
            money = money%values[i];
        }

        return answer;
    }
}
