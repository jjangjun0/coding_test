import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        int length = score.length;
        
        Arrays.sort(score);
        
        int idx = length;
        while (true) {
            idx -= m;
            if (idx < 0)
                break;
            
            result += score[idx] * m; // m개의 사과에 대해 박스 안에서의 최소값으로 가격을 결정
        }
        
        return result;
    }
}