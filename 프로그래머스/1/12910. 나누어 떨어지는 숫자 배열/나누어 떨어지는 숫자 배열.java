import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> L = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] % divisor == 0)
                L.add(arr[i]);
        }
        
        Collections.sort(L);
        
        int size = L.size();
        if (size == 0) {
            L.add(-1);
            size += 1;
        }
        int[] answer = new int[size];
        for (int i = 0; i < size; i++)
            answer[i] = L.get(i);
        return answer;
    }
}