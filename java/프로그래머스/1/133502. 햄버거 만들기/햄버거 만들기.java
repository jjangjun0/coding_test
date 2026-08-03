import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int count = 0;
        
        int size = ingredient.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            stack.push(ingredient[i]);
            if (stack.size() >= 4 && is_make(stack)) {
                for (int j = 0; j < 4; j++)
                    stack.pop();
                count++;
            }
        }
        return count;
    }
    
    private boolean is_make(Deque<Integer> stack) {
        boolean result = true;
        int correct = 1321;     // 1 2 3 1 -> 꺼내오면 1 3 2 1
        int recipe = 0;         // 1 : 빵, 2 : 야채, 3 : 고기

        for (int i = 0; i < 4; i++)
            recipe = recipe * 10 + stack.pop();
        
        result = (recipe == correct ? true : false);
        for (int i = 0; i < 4; i++) {
            stack.push(recipe % 10);
            recipe /= 10;
        }
        
        return result;
    }
    
    private void print_stack(Deque<Integer> stack) {
        Deque<Integer> copy = new ArrayDeque<>(stack); // 얕은 복사
        StringBuilder sb = new StringBuilder();
        while (!copy.isEmpty()) {
            sb.append(copy.pop());
            sb.append(' ');
        }
        System.out.println(sb.reverse());
    }
}