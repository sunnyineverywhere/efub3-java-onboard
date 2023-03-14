package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        //get the sum of all numbers
        Integer sum = 0;
        for(int i : numbers) sum += i;
        //sort the numbers list
        Collections.sort(numbers);
        //add avg value to the answer list
        answer.add(sum/5);
        //add median value to the answer list
        answer.add(numbers.get(2));

        return answer;
    }
}
