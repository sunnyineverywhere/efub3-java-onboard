package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        if(minute-45<0) {
            if (hour == 0)
                hour = 23;
            else
                hour--;
            int c = minute - 45;
            minute = 60 + c;
        }
        else
            minute=minute-45;
        answer.add(hour);
        answer.add(minute);
        return answer;
    }
}
