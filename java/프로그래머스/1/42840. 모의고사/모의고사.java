import java.util.*;

class Solution {
    private static final int[][] give_up_pattern = {
        {1, 2, 3, 4, 5},
        {2, 1, 2, 3, 2, 4, 2, 5},
        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    public int[] solution(int[] answers) {
        int length = answers.length;

        int L1, L2, L3;
        L1 = give_up_pattern[0].length;
        L2 = give_up_pattern[1].length;
        L3 = give_up_pattern[2].length;
        
        int idx1, idx2, idx3;
        idx1 = idx2 = idx3 = 0;
        
        int[] score = new int[3]; // 각 1번, 2번, 3번 수포자가 맞힌 문제 개수 저장
        for (int i = 0; i < length; i++) {
            if (answers[i] == give_up_pattern[0][idx1++])
                score[0]++;
            if (answers[i] == give_up_pattern[1][idx2++])
                score[1]++;
            if (answers[i] == give_up_pattern[2][idx3++])
                score[2]++;
            
            if (idx1 >= L1)
                idx1 = 0;
            if (idx2 >= L2)
                idx2 = 0;
            if (idx3 >= L3)
                idx3 = 0;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int best_score = max(max(score[0], score[1]), max(score[1], score[2]));
        for (int i = 0; i < 3; i++) {
            if (score[i] == best_score)
                list.add(i + 1);
        }
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    private int max(int a, int b) {
        return (a > b ? a : b);
    }
}