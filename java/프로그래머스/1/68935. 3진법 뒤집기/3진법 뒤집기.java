class Solution {
    static final int XXX = 3; // 3진법
    
    public int solution(int n) {
        String num_to_3s = "";
        // 거꾸로 된 3진법 수 구하기
        while (n > 0) {
            num_to_3s += String.valueOf(n % XXX);
            n /= XXX;
        }
        
        // 이에 대해서 10진법으로
        int answer = 0;
        int multiple = 1;
        int length = num_to_3s.length();
        for (int i = length - 1; i >= 0; i--) {
            answer += multiple * (num_to_3s.charAt(i) - '0');
            multiple *= XXX;
        }
        return answer;
    }
}