class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            return 1;
        }
        return -1;
        
        //다른분의 풀이 (삼항연산자 (boolean자료형으로 참 또는 거짓) ? 참일 때 연산결과 : 거짓일 때 연산결과)
        //int answer = (num1 == num2) ? 1 : -1;
        //return answer;
    }
}
