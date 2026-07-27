class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int idx = -1;
        
        int length = section.length;
        for (int i = 0; i < length; i++) {
            if (idx < section[i]) {
                idx = section[i] + m - 1; // ex) section[0] = 2, m = 4라면 [2,3,4,5]가 색칠되어 마지막이 2 + 4 - 1
                result++;
            }
        }
        
        return result;
    }
}