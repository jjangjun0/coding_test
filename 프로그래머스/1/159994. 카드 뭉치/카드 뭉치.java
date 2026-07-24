class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int L1, L2, L3;
        L1 = cards1.length;
        L2 = cards2.length;
        L3 = goal.length;
        
        int idx1 = 0, idx2 = 0, rest = 0;
        boolean is_ok = true;
        if (cards1[0] == goal[0])
            rest = 0;
        else if (cards2[0] == goal[0])
            rest = 1;
        else
            is_ok = false;
        System.out.print("ㅏ");
        if (is_ok) {
            System.out.print("비교");
            String[] temp = new String[L3];
            for (int i = 0; i < L3; i++) {
                if (i % 2 == rest)
                    temp[i] = cards1[i / 2];
                else
                    temp[i] = cards2[i / 2];
            }
            
            for (int i = 0; i < L3; i++)
                System.out.print(temp[i] + " ");
            System.out.println();
            
            for (int i = 0; i < L3; i++) {
                if (temp[i] != goal[i]) {
                    is_ok = false;
                    break;
                }
            }
        }
        
        return (is_ok ? "Yes" : "No");
    }
}