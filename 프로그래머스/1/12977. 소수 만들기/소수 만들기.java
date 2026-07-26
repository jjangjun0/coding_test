import java.util.*;

class Solution {
    private int count;
    
    public int solution(int[] nums) {
        int X_3 = 3; // 서로 다른 3개
        
        this.count = 0;
        
        int N = nums.length;
        int M = X_3;
        int[] output = new int[N];
        boolean[] used = new boolean[N];
        
        func(0, N, M, nums, output, used);
        
        return this.count;
    }
    
    // arr[] : 실제 값이 들어 있는 배열, output[] : index를 저장하는 배열
    void func(int k, int N, int M, int[] arr, int[] output, boolean[] used) {
        if (k == M) {
            int sum = 0;
            for (int i = 0; i < M; i++)
                sum += arr[output[i]];
            
            if (is_prime(sum))
                this.count++;
            return ;
        }
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                if (k > 0 && output[k - 1] >= i)
                    continue; // output[k]는 output[k-1] 보다 1 이상 큰 값으로 한다. 
            
                output[k] = i;
                used[i] = true;
                func(k+1, N, M, arr, output, used);
                used[i] = false;
            }
        }
    }
    
    // 작은 정수값에 대한 소수 판단 함수
    boolean is_prime(int N) {
        if (N < 2)
            return false;
        
        boolean result = true;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}