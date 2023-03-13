package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {};
        answer=new Integer[20];

        int a = 0, b = 0, temp = 0;

        for (int i = 0; i < 20; i++)
            answer[i] = i+1;

        for (int i = 0; i < 10; i++)
        {
            a=flipCards[i][0]-1;
            b=flipCards[i][1]-1;

            if((b-a)%2==0)
                for (int j = 0; j < (b-a)/2; j++)
                {
                    temp = answer[b - j];
                    answer[b - j] = answer[j + a];
                    answer[j + a] = temp;
                }
            else
                for (int j = 0; j <= (b - a) / 2; j++)
                {
                    temp = answer[b - j];
                    answer[b - j] = answer[j + a];
                    answer[j + a] = temp;
                }
        }
        return answer;
    }
}
