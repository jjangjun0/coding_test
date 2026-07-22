class Solution {
    public int solution(int a, int b, int n) {
        int have, take, rest, sum;
        
        sum = 0;
        have = n;
        while (have >= a) {
            take = have / a * b;
            rest = have % a;
            sum += take;
            
            have = take + rest;
        }
        
        return sum;
    }
}