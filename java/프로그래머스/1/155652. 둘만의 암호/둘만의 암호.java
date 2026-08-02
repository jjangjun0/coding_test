class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] is_skip = new boolean[26];
        int length = skip.length();
        for (int i = 0; i < length; i++)
            is_skip[skip.charAt(i) - 'a'] = true;
        
        StringBuilder sb = new StringBuilder();
        length = s.length();
        for (int i = 0; i < length; i++)
            sb.append(jump_n(s.charAt(i), index, is_skip));
        
        return sb.toString();
    }
    private char jump_n(char c, int index, boolean[] is_skip) {
        int count = 0;
        int i = c - 'a';
        while (count != index) {
            if (i + 1 == 26)
                i = 0;
            else
                i += 1;
            
            if (!is_skip[i])
                count++;
        }
        return (char) ('a' + i);
    }
}