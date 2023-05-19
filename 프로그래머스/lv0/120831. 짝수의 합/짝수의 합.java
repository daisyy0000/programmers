class Solution {
    public int solution(int n) {
        int answer = 0;
        int quotient = n/2; //몫
        
        for(int i=0; i <= quotient; i++){
           answer += (2*i); 
        }
        
        //다른사람 풀이
        /*
        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                answer += i;
        */
        
        return answer;
    }
}