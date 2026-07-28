import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[2];
        
        int length = win_nums.length;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int idx1, idx2, count_0, count_correct;
        idx1 = idx2 = count_0 = count_correct = 0;
        while (true) {
            if (lottos[idx1] == 0)
                count_0++; // 0의 개수
            
            if (lottos[idx1] == win_nums[idx2]) {
                count_correct++; // 서로 같은 경우
                idx1++;
                idx2++;
            }
            else if (lottos[idx1] < win_nums[idx2])
                idx1++;
            else
                idx2++;
            
            if (idx1 >= length || idx2 >= length)
                break;
        }
        
        int max_correct = count_0 + count_correct;
        result[0] = (max_correct > 1 ? 7 - max_correct : 6);
        result[1] = (count_correct > 1 ? 7 - count_correct : 6);
        
        return result;
    }
}