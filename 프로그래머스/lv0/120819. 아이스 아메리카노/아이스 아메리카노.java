class Solution {
    public int[] solution(int money) {
        int coffee = 0;
        int change = money;
        
        if(money >= 5500){
        coffee = money / 5500;
        change = money - 5500 * coffee;
        }
       
        int[] answer = {coffee, change};
        return answer;
    }
}