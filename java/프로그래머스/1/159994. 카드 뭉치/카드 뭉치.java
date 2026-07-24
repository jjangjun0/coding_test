class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int L1, L2, L3;
        L1 = cards1.length;
        L2 = cards2.length;
        L3 = goal.length;
        
        int idx1 = 0, idx2 = 0;
        boolean is_ok = true;
        for (int i = 0; i < L3; i++) {
            if (idx1 < L1 && cards1[idx1].equals(goal[i]))
                idx1++;
            else if (idx2 < L2 && cards2[idx2].equals(goal[i]))
                idx2++;
            else {
                is_ok = false;
                break;
            }
        }
        
        return (is_ok ? "Yes" : "No");
    }
}