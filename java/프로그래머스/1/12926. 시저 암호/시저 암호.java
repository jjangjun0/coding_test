class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();
        int change;
        char c;
        for (int i = 0; i < length; i++) {
            c = sb.charAt(i);
            if (c >= 'a' && c <= 'z')
                change = (c + n > 'z' ? c + n - 26 : c + n);
            else if (c >= 'A' && c <= 'Z')
                change = (c + n > 'Z' ? c + n - 26 : c + n);
            else
                change = c;
            
            
            sb.setCharAt(i, (char) (change));
        }
        return sb.toString();
    }
}