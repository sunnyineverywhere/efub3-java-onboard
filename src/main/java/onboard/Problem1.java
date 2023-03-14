package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        //subtract 45 from the minute value
        minute -= 45;

        //if the minute value became less than zero after the subtraction,
        //add 60 to it and subtract 1 from the hour value
        if(minute<0) {
            hour--; minute += 60;
        }
        //if the hour value became less than 0, add 24 to it
        if(hour<0) hour = 24+hour;

        //add the values to the answer list
        answer.add(hour);
        answer.add(minute);

        //return answer
        return answer;
    }
}
