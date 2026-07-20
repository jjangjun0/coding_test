class Solution {
    public boolean solution(String s) {
        boolean is_length_4_or_6, is_only_number, answer;
        is_length_4_or_6 = false;
        
        int length = s.length();
        if (length == 4 || length == 6)
            is_length_4_or_6 = true;
        
        is_only_number = true;
        char c;
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                is_only_number = false;
                break;
            }
        }
        
        if (is_length_4_or_6 && is_only_number)
            answer = true;
        else
            answer = false;
        
        return answer;
    }
}