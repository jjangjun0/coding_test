class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int size1 = keymap.length;
        KeymapHave[] keys = new KeymapHave[size1];
        for (int i = 0; i < size1; i++)
            keys[i] = new KeymapHave(keymap[i]);
        
        boolean is_exist;
        int min, length, size2 = targets.length;
        int count;
        int[] result = new int[size2];
        for (int i = 0; i < size2; i++) {
            is_exist = true;
            count = 0;
            length = targets[i].length();
            for (int j = 0; j < length; j++) {
                min = makeAlphabet(keys, targets[i].charAt(j));
                if (min == -1) {
                    is_exist = false;
                    break;
                }
                count += (min + 1); // A의 index는 0이고, 이를 누르는 행위는 +1번으로 간주한다
            }
            
            if (!is_exist)
                result[i] = -1; // 만들 수 없는 경우 -1 저장
            else
                result[i] = count;
        }
        
        
        return result;
    }
    
    private static class KeymapHave {
        int[] index;
        
        KeymapHave(String keyString) {
            index = new int[26];
            int length = keyString.length();
            for (int i = 0; i < 26; i++) index[i] = -1; // 초기화
            
            // 해당 문자열이 첫번째로 등장하는 index
            for (char c = 'A'; c <= 'Z'; c++) {
                for (int i = 0; i < length; i++) {
                    if (c == keyString.charAt(i)) {
                        index[c - 'A'] = i;
                        break;
                    }
                }
            }
        }
    }
    private int makeAlphabet(KeymapHave[] keys, char c) {
        int MAX_IDX = 101;
        int idx;
        int size = keys.length; // key들의 개수
        int min = MAX_IDX;      // 가질 수 없는 수 (keymap의 최대 길이는 100)
        for (int i = 0; i < size; i++) {
            idx = keys[i].index[c - 'A']; // 특정 key에서 c가 등장하는 첫번째 index
            if (idx == -1)
                continue;
            min = (min > idx ? idx : min);
        }
        
        return (min == MAX_IDX ? -1 : min);
    }
}