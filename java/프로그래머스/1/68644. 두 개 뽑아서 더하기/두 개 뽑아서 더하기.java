import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        int length = numbers.length;
        // Arrays.sort(numbers);
        
        int sum;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                sum = numbers[i] + numbers[j];
                if (!list.contains(sum))
                    list.add(Integer.valueOf(sum));
            }
        }
        Collections.sort(list);

        // int[] result 반환
        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] = list.get(i).intValue();
        return result;
    }
}