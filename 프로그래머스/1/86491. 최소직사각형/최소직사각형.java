class Solution {
    public int max(int x, int y) {
        return (x > y ? x : y);
    }
    public int min(int x, int y) {
        return (x < y ? x : y);
    }
    public int solution(int[][] sizes) {
        int[] A = new int[2];
        
        int length = sizes.length;
        for (int i = 0; i < length; i++) {
            A[0] = max(A[0], max(sizes[i][0], sizes[i][1]));
            A[1] = max(A[1], min(sizes[i][0], sizes[i][1]));
        }
        
        return A[0] * A[1];
    }
}