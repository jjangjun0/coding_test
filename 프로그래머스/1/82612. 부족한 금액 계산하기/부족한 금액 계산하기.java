class Solution {
    public long solution(int price, int money, int count) {
        long need_money = 0;
        
        for (int i = 1; i <= count; i++)
            need_money += i;
        need_money *= price;
        
        if (need_money < money)
            need_money = 0; // 금액이 부족하지 않는 경우 0을 리턴
        else
            need_money -= money;

        return need_money;
    }
}