class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int[] answer;
        if (length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[length - 1];
            int min_idx = 0;
            for (int i = 0; i < length; i++) {
                if (arr[min_idx] > arr[i])
                    min_idx = i;
            }
            
            int idx = 0;
            for (int i = 0; i < length; i++) {
                if (i != min_idx)
                    answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}