import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        long answer = 0;
        for (long x : list) {
            answer = answer * 10 + x;
        }
        
        return answer;
    }
}