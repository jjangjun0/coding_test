class Solution {
    public String solution(int[] food) {
        StringBuilder SB = new StringBuilder();
        
        int length = food.length;
        int repeat;
        // int waters = food[0]; // 항상 1
        for (int i = 1; i < length; i++) {
            repeat = food[i] / 2;
            for (int j = 0; j < repeat; j++)
                SB.append(Integer.toString(i));
        }
        String front_S = SB.toString();
        String back_S = SB.reverse().toString();
        
        return front_S + "0" + back_S;
    }
}