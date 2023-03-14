package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        Integer T = 0;

        for(int i=N-1; i>=0; i--){
            T = values[i];
            if(T <= K) {
                answer += K/T;
                K = K%T;
            }
        }

        return answer;
    }
}
