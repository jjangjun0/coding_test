class Solution {
    public boolean solution(int x) {
        int digit_sum = 0;
        int temp = x; // x 복사본
        
        while (temp > 0) {
            digit_sum += temp % 10;
            temp /= 10;
        }
        
        return x % digit_sum == 0;
    }
}