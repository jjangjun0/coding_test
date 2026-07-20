class Solution {
    private static int result = 0;
    
    private static int temp = 0;
    private final boolean SEE_LOG = false; // 진행과정 출력
    void func(int k, int N, int M, int[] output, int[] arr, boolean[] used) {
        if (SEE_LOG) {
            System.out.print("$ " + ++temp + "번째:   (");
            for (int i = 0; i < M; i++) {
                System.out.print(output[i]);
                if (i != M - 1) System.out.print(' ');
            }
            System.out.println(")");   
        }
        
        if (k == M) {
            int sum = 0;
            for (int i = 0; i < M; i++) {
                sum += arr[output[i]];
            }
            if (sum == 0)
                result++; // 삼총사 count
            return ;
        }
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                if (k > 0 && output[k - 1] >= i)
                    continue; // 중복 X, 삼총사의 index가 오름차순이 되도록
                
                output[k] = i;
                used[i] = true;
                func(k + 1, N, M, output, arr, used);
                used[i] = false;
            }
        }
    }
    
    
    public int solution(int[] number) {
        int length = number.length;
        int[] output = new int[3];
        boolean[] used = new boolean[length];
        
        func(0, length, 3, output, number, used);
        
        return this.result;
    }
}