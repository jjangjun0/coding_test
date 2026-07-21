class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int length = num.length();
        int[] answer = new int[length];
        for (int i = 0; i < length; i++)
            answer[i] = num.charAt(length - i - 1) - '0';
        return answer;
    }
}