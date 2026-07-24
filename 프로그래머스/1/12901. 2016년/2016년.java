class Solution {
    private static String[] DAY = {
        "MON","TUE","WED","THU","FRI","SAT", "SUN"
    };
    
    public String solution(int a, int b) {
        int result = 0;
        
        int days = 0;
        // 1월부터 a-1월까지의 날짜
        for (int i = 1; i < a; i++) {
            if (i == 2)
                days += 29;
            else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                days += 31;
            else
                days += 30;
        }
        
        // a월 1일부터 a월 b일까지의 날짜
        days += (b - 1); // ex) 1월 3일 이라면 (b - 1)일 지난 것이다.
        
        // 2016년 1월 1일은 금요일이기에 배열 관점에서 DAY[4] 부터 시작
        return DAY[(days + 4) % 7];
    }
}