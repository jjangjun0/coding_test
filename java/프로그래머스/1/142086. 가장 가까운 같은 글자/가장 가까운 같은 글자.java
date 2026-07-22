class Solution {
    private boolean[] is_first = new boolean [26];
    private int[] before_idx = new int[26];
    
    public int[] solution(String s) {
        int length = s.length();
        
        int[] result = new int[length];
        int alphabetIndex;
        for (int i = 0; i < length; i++) {
            alphabetIndex = s.charAt(i) - 'a';
            if (!is_first[alphabetIndex]) {
                result[i] = -1;
                before_idx[alphabetIndex] = i;
                
                is_first[alphabetIndex] = true;
                continue;
            }
            
            result[i] = i - before_idx[alphabetIndex];
            before_idx[alphabetIndex] = i;
        }
        return result;
    }
}