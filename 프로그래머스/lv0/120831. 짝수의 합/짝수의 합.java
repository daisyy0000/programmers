class Solution {
    public int solution(int n) {
        int answer = 0;
        int quotient = n/2; //몫
        
        for(int i=0; i <= quotient; i++){
           answer += (2*i); 
        }
        

        return answer;
    }
}