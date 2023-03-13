package onboard;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        int length=(int)(Math.log10(number)+1);
        ArrayList num = new ArrayList();

        for(int i=length-1;i>=0;i--)
        {
            int a=(int)Math.pow(10,i);
            num.add(number/a);
            number=number%a;
        }
        num.sort(Comparator.reverseOrder());

        int j=0;
        for(int i=length-1;i>=0;i--)
        {
            answer+=(int)num.get(j)*(int)Math.pow(10,i);
            j++;
        }
        return answer;
    }
}
