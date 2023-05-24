class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //나의 풀이
        for(int i=1; i <=n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        
        //다른 풀이(속도는 훨씬 좋다)
        /*
        for(int i=1; i * i <= n; i++){
            if(i * i == n){
                answer++;
            }else if(n % i == 0){
                answer += 2;
            }
        }
        */

        return answer;
    }
}
