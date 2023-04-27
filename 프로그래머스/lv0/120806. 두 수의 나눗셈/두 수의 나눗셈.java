class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 >0 && num1 <= 100 && num2 > 0 && num2 <= 100){
            float a1 = (float)num1;
            float a2 = (float)num2;
            float test = a1 / a2;
    
            answer = (int)(test * 1000);
            return answer;
        }
        return answer;
    }
}