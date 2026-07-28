class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0, knight;
        for (int i = 1; i <= number; i++) {
            knight = submultiple(i);
            result += (knight > limit ? power : knight);
        }
        
        return result;
    }
    
    private int submultiple(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }
}