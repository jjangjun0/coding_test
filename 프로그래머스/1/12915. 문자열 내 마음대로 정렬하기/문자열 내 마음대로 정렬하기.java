import java.util.*;

class Solution {
    private static int idx = 0; // 전역변수로 이용
    
    // 음수 → a가 b보다 앞 | 0 → 두 문자열이 같음 | 양수 → a가 b보다 뒤
    private int compare(String a, String b) {
        int result = 0;
        char c1, c2;
        c1 = a.charAt(this.idx);
        c2 = b.charAt(this.idx);
        if (c1 < c2)
            result = -1;    // 음수
        else if (c1 == c2) {
            // 같은 경우 오름차순으로 사전 순서대로
            return a.compareTo(b);
        }
        else
            result = 1;     // 양수
        return result;
    }
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        
        this.idx = n;
        Collections.sort(list, this::compare);
        
        System.out.println(list);
        return list.toArray(new String[0]);
    }
}