package onboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        int ave=0, mid=0, sum=0;

        for(int i=0;i<5;i++)
        {
            sum+=numbers.get(i);
        }
        numbers.sort(Comparator.naturalOrder());
        ave=sum/5;
        mid=numbers.get(2);
        answer.add(0,ave);
        answer.add(1,mid);
        return answer;
    }
}
