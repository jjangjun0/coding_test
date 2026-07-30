import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] have = new int[n];
        // init
        Arrays.fill(have, 1);
        
        // lost
        for (int student : lost)
            have[student - 1]--;
        
        // reserve
        for (int student : reserve)
            have[student - 1]++; // 자기가 잃어버리면 자기가 사용하게 된다
        
        // lend
        for (int i = 0; i < n; i++) {
            if (have[i] != 0)
                continue;
            
            // have[i] = 0일 때,
            if (i > 0 && have[i - 1] == 2) { // 작은 사이즈 여유분이 있는 경우
                have[i - 1]--; 
                have[i]++;
            }
            else if (i < n - 1 && have[i + 1] == 2) { // 큰 사이즈 여유분이 있는 경우
                have[i + 1]--;
                have[i]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (have[i] != 0)
                count++;
        }
        
        return count;
    }
}