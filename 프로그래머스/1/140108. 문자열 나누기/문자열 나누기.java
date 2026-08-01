class Solution {
    public int solution(String s) {
        int count = 0;
        int length = s.length();
        
        boolean is_checking = false;
        int same = 0, not_same = 0;
        int before_idx = 0;
        for (int i = 0; i < length; i++) {
            if (!is_checking) {
                same = not_same = 0;
                before_idx = i;
                is_checking = true;
            }
            
            if (s.charAt(before_idx) == s.charAt(i))
                same++;
            else
                not_same++;
            
            if (same == not_same) {
                is_checking = false;
                count++; // 문자열 분해
            }
            else if (i == length - 1)
                count++; // 설정한 비교문자 개수와 그렇지 않은 개수가 같지 않더라도, 문자열이 끝나면 분할한다.
        }
        
        
        return count;
    }
}