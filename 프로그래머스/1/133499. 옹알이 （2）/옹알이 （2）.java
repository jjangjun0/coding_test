import java.util.*;

class Solution {
    private static String[] joka = { "aya", "ye", "woo", "ma" };
    public int solution(String[] babbling) {
        int count = 0;
        int length = babbling.length;
        for (int i = 0; i < length; i++) {
            if (is_possible(babbling[i]))
                count++;
        }
        
        return count;
    }
    
    boolean is_possible(String S) {
        boolean result = true;
        
        int idx = 0;
        int last_say = -1;
        int L = S.length();
        boolean is_exist;
        
        while (true) {
            is_exist = false;
            for (int i = 0; i < 4; i++) {
                if (i != last_say && // 중복 X
                        S.startsWith(joka[i], idx)) {  // joka로 시작
                    is_exist = true;
                    idx += joka[i].length();
                    last_say = i;
                    break;
                }
            }
            
            if (idx == L)
                break; // 딱 떨어지는 경우
            
            if (!is_exist) {
                result = false;
                break;
            }
        }
        
        return result;
    }
}