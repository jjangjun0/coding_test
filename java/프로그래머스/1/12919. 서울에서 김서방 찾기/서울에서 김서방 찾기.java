class Solution {
    public String solution(String[] seoul) {
        int idx = -1;
        
        int length = seoul.length;
        for (int i = 0; i < length; i++) {
            if (seoul[i].equals("Kim")) {
                idx = i;
                break;
            }
        }
        return "김서방은 " + idx + "에 있다";
    }
}