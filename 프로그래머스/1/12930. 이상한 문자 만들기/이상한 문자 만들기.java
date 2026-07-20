import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class Solution {
    public static List<String> split(String str, String delims) {
        String regex = "[" + delims + "]"; // "]+" 은 연속된 구분자는 1개의 구분자로 본다.
        return Arrays.asList(str.split(regex, -1));
    }
    
    public static String change_alpha(String s) {
        String STR = "";
        
        int length = s.length();
        char c;
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (i % 2 == 0)
                STR += Character.toUpperCase(c);
            else
                STR += Character.toLowerCase(c);
        }
        
        return STR;
    }
    
    public String solution(String s) {
        String answer = "";
        
        List<String> tokens = split(s, " ");
        int T = tokens.size();
        
        for (int i = 0; i < T; i++) {
            answer += change_alpha(tokens.get(i));
            if (i < T - 1)
                answer += ' ';
        }
        
        return answer;
    }
}