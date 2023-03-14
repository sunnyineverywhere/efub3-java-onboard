package onboard;

import java.util.Stack;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        //initialize the 20 cards
        Integer[] answer = new Integer[20];
        for(int i=0; i<20; i++) answer[i] = i+1;

        //solve
        for(int i=0; i<10; i++){
            //declare a stack
            Stack<Integer> stack = new Stack<>();
            //rearrange cards using the stack
            for(int j=flipCards[i][0]; j<=flipCards[i][1]; j++) stack.add(answer[j-1]);
            for(int j=flipCards[i][0]; j<=flipCards[i][1]; j++) answer[j-1] = stack.pop();
        }
        return answer;
    }
}
