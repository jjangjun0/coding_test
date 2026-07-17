import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        List<Character> L = new ArrayList<>();
        int length = s.length();
        for (int i = 0; i < length; i++)
            L.add(s.charAt(i));
        
        Collections.sort(L, Collections.reverseOrder());
        
        String answer = "";
        for (int i = 0; i < length; i++)
            answer += L.get(i);
        return answer;
    }
}