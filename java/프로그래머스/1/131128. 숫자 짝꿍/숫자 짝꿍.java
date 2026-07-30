class Solution {
    public String solution(String X, String Y) {
        int[] NUM1 = new int[10];
        int[] NUM2 = new int[10];
        count_numbers(NUM1, X);
        count_numbers(NUM2, Y);
        
        int[] common = new int[10];
        for (int i = 0; i < 10; i++)
            common[i] = (NUM1[i] < NUM2[i] ? NUM1[i] : NUM2[i]);
        
        String result = "";
        for (int i = 9; i > 0; i--) {
            result += Integer.toString(i).repeat(common[i]);
        }
        if (common[0] != 0) {
            if (result.equals(""))
                result = "0"; // 오직 0만 있는 경우
            else {
                result += "0".repeat(common[0]);
            }
        }

        return (result.equals("") ? "-1" : result); // 아무것도 겹치지 않으면 "-1" 반환
    }
    
    private void count_numbers(int[] NUM, String STR) {
        int length = STR.length();
        for (int i = 0; i < length; i++) {
            NUM[STR.charAt(i) - '0']++;
        }
    }
}