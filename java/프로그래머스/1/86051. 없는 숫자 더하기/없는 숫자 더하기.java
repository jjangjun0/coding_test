class Solution {
    public int solution(int[] numbers) {
        boolean[] is_exist = new boolean[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            is_exist[numbers[i]] = true;
        }
        int sum = 0;
        for (int i = 0 ; i < 10; i++) {
            if (!is_exist[i])
                sum += i;
        }
        return sum;
    }
}