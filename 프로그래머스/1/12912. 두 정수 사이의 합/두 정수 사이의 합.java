class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i1 = a, i2 = b;
        if (a > b) {
            i1 = b;
            i2 = a;
        }
        for (int i = i1; i <= i2; i++)
            answer += i;
        return answer;
    }
}