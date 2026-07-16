class Solution {
    public String solution(int n) {
        String answer = "";
        int division = n / 2;
        int remainder = n % 2;
        for (int i = 0; i < division; i++)
            answer += "수박";
        if (remainder == 1)
            answer += "수";
        return answer;
    }
}