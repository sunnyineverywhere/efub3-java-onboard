package onboard;

import java.util.Arrays;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        String input = number.toString();
        Integer len = input.length();
        char[] charList = input.toCharArray();
        Integer[] arr = new Integer[len];
        for(int i=0; i<len; i++) arr[i] = charList[i] - '0';
        Arrays.sort(arr);
        for(int i=0; i<len; i++){
            Double pos = Math.pow(10, i);
            answer += (int)(arr[i] * pos);
        }
        return answer;
    }
}
