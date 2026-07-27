class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int DEBUG = 0;

        boolean[] is_paint = new boolean[n];
        for (int i = 0; i < n; i++)
            is_paint[i] = true;

        int length = section.length;
        for (int i = 0; i < length; i++)
            is_paint[section[i] - 1] = false;
        print(DEBUG++, is_paint);

        // two-point
        int mode = 1; // 1 -> idx1, 2 -> idx2
        int idx1 = 0, idx2 = n - 1, temp_end;
        while (true) {
            if (idx1 > n - m && idx2 < m)
                break;

            switch (mode) {
                case 1:
                    if (is_paint[idx1])
                        idx1++;
                    else {
                        temp_end = idx1 + m;
                        System.out.print(idx1 + " " + temp_end + "===>>> ");
                        for (int i = idx1; i < temp_end; i++)
                            is_paint[i] = true;
                        idx1 += m;
                        mode = 2;
                        result++; // 색칠
                    }

                    if (idx1 > n - m)
                        mode = 2;
                    break;
                case 2:
                    if (is_paint[idx2])
                        idx2--;
                    else {
                        temp_end = idx2 - m;
                        System.out.print(idx2 + " " + temp_end + "===>>> ");
                        for (int i = idx2; i > temp_end; i--)
                            is_paint[i] = true;
                        idx2 -= m;
                        mode = 1;
                        result++; // 색칠
                    }

                    if (idx2 < m)
                        mode = 1;
                    break;
            }
            System.out.print(idx1 + " " + idx2 + " -> "); print(DEBUG++, is_paint);
        }

        return result;
    }

    void print(int n, boolean[] arr) {
        System.out.print(n + "번째: ");

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i])
                System.out.print(1);
            else
                System.out.print(0);
            System.out.print(" ");
        }
        System.out.println();
    }
}