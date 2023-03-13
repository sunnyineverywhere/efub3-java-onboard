package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;

        for(int i=N-1;i>=0;i--) {
            int v=values[i];
            if(K/v==0)
                continue;
            else {
                answer+=K/v;
                K=K%v;
            }
        }
        return answer;
    }
}
