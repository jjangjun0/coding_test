class Solution {
    public int solution(int num) {
        int count = 0;
        
        while (num != 1) {
            if (num % 2 == 1)
                num = num * 3 + 1;
            else
                num /= 2;
            count++;
            
            if (count >= 500) {
                count = -1;
                break;
            }
        }
        
        return count;
    }
}