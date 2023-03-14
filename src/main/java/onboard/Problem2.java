package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = new Integer[20];
        for(int i=0; i<20; i++){  // initialize
            answer[i] = i+1;
        }

        int count = 0;
        while(count < 10){
            int a = flipCards[count][0] - 1;
            int b = flipCards[count][1] - 1;
            int mid = (a+b) / 2;
            int temp = 0;
            for(int i=a, j=b; i<=mid; i++, j--){
                temp = answer[i];
                answer[i] = answer[j];
                answer[j] = temp;
            }
            count++;
        }

        return answer;
    }
}
