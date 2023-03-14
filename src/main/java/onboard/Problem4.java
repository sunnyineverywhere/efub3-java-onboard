package onboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        String str = number.toString();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            list.add(Integer.parseInt(str.substring(i,i+1)));
        }

        list.sort(Comparator.naturalOrder());

        for(int i=0; i<list.size(); i++){
            answer += (int)(list.get(i)*Math.pow(10, i));
        }

        return answer;
    }
}
