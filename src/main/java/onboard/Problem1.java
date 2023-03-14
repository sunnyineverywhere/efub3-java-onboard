package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        // case1: minute>=45
        if(minute >= 45){
            minute -= 45;
        }
        else{  // case2: minute<45
            minute += 15;
            if(hour > 0)  // case2-1: hour>0
                hour -= 1;
            else  // case2-2: hour==0
                hour = 23;
        }

        answer.add(hour);
        answer.add(minute);
        return answer;
    }
}
