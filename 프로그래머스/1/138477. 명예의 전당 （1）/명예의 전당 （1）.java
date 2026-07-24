import java.util.*;

class Solution {
    private int insert_idx(List<Integer> list, int N) {
        int size = list.size();
        
        int result = size; // 못 찾으면 맨 뒤에 추가하도록 (중요)
        for (int i = 0; i < size; i++) {
            if (N > list.get(i)) { // N보다 작아지는 인덱스에서 멈춘다.
                result = i;
                break;
            }
        }
        
        return result;
    }
    
    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] result = new int[length];
        List<Integer> honor_list = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            honor_list.add(insert_idx(honor_list, score[i]), score[i]);
            
            if (honor_list.size() > k)
                honor_list.remove(honor_list.size() - 1); // max를 k개 갖도록
            
            result[i] = honor_list.get(honor_list.size() - 1);
            
            // for (int j = 0; j < honor_list.size(); j++) System.out.print(honor_list.get(j) + " ");
            // System.out.println();
        }
        
        return result;
    }
}