class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        //n이 짝수일 경우
        if(n % 2 == 0){
            answer = new int[n/2];
            for(int i=0; i < n/2; i++){
                answer[i] = (2*i)+1;
            }
        //n이 홀수인 경우
        }else if(n % 2 != 0){
            answer = new int[(n/2)+1];
            for(int i=0; i <= n/2; i++){
                answer[i] = (2*i)+1;
            }
        }
        return answer;
    }
}