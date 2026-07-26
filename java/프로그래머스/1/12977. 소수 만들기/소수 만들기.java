import java.util.*;

class Solution {
    private ArrayList<Integer[]> list; // 서로 다른 3개로 소수를 만들 수 있는 순서쌍
    private int count;

    public int solution(int[] nums) {
        int X_3 = 3; // 서로 다른 3개

        this.list = new ArrayList<>();
        this.count = 0;

        int N = nums.length;
        int M = X_3;
        int[] output = new int[N];
        boolean[] used = new boolean[N];

        func(0, N, M, nums, output, used);

        print_list();
        return this.count;
    }

    // arr[] : 실제 값이 들어 있는 배열, output[] : index를 저장하는 배열
    void func(int k, int N, int M, int[] arr, int[] output, boolean[] used) {
        if (k == M) {
            int sum = 0;
            for (int i = 0; i < M; i++)
                sum += arr[output[i]];

            if (is_prime(sum)) {
                Integer[] selected = new Integer[M];

                for (int i = 0; i < M; i++)
                    selected[i] = Integer.valueOf(arr[output[i]]);

                this.list.add(selected);
                this.count++;
            }
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
    // 리스트 프린트
    void print_list() {
        int T = list.size();
        int L;
        for (int i = 0; i < T; i++) {
            System.out.print('[');
            L = list.get(i).length;
            for (int j = 0; j < L; j++) {
                System.out.print(list.get(i)[j]);
                if (j != L - 1)
                    System.out.print(' ');
            }
            System.out.print(']');

            if (i != T - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,2,7,6,4};
        int answer = solution.solution(nums);
        System.out.println("소수를 만들 수 있는 경우의 수: " + answer);

        int[] nums2 = {1,2,3,4};
        int answer2 = solution.solution(nums2);
        System.out.println("소수를 만들 수 있는 경우의 수: " + answer2);
    }
}