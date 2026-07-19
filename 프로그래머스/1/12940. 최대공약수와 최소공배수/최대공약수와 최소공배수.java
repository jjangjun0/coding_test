class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int greatest_divisor = 1, least_multiple = 1;
        
        // 최대공약수
        if (n > m) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0)
                    greatest_divisor = i;
            }
        }
        else {
            for (int i = 1; i <= m; i++) {
                if (n % i == 0 && m % i == 0)
                    greatest_divisor = i;
            }
        }
        // 최대공배수 : (n / greatest_divisor) * (m / greatest_divisor)
        least_multiple = n * m / greatest_divisor;
        
        answer[0] = greatest_divisor;
        answer[1] = least_multiple;
        return answer;
    }
}