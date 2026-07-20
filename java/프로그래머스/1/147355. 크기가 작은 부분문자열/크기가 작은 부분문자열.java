class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int length = p.length();
    
        long P = Long.parseLong(p);
        long temp;
        
        int end_idx = t.length() - length + 1;
        for (int i = 0; i < end_idx; i++) {
            temp = Long.parseLong(t.substring(i, i + length));
            if (temp <= P)
                count++;
        }
    return count;
    }
}