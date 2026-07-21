import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int T = commands.length;
        int[] result = new int[T];
        int size;
        for (int i = 0; i < T; i++) {
            size = commands[i][1] - commands[i][0] + 1;
            
            int[] temp = new int[size];
            for (int j = 0; j < size; j++)
                temp[j] = array[commands[i][0] - 1 + j];
            
            Arrays.sort(temp);
            
            result[i] = temp[commands[i][2] - 1];
        }
        return result;
    }
}