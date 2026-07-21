class Solution {
    private static final String[] NUM = {
            "zero",
            "one",
            "two",
	        "three",
	        "four",
	        "five",
	        "six",
	        "seven",
	        "eight",
	        "nine"
    };
    public int solution(String s) {
        StringBuilder STR = new StringBuilder(s);
        
        int idx;
        for (int i = 0; i < 10; i++) {
            idx = STR.indexOf(NUM[i]);
            
            while (idx != -1) {
                // System.out.println("삭제 전 STR:" + STR);
                STR.delete(idx, idx + NUM[i].length());
                // System.out.println("삭제 후 STR:" + STR);
                STR.insert(idx, i); // 숫자 추가
                idx = STR.indexOf(NUM[i], idx + 1); // 숫자 그 다음부터 찾도록
            }
        }
        
        return Integer.parseInt(STR.toString());
    }
}