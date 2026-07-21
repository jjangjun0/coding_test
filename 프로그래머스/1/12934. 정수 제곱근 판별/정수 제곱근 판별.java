import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = -1;
        Boolean is_square = false;
        long x = 1;
        while (x * x <= n) {
            if (x * x == n)
                is_square = true;
            x++;
        }
        if (is_square)
            x = x * x;
        else
            x = -1;
        return x;
    }
}