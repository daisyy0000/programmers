class Solution {
    public int solution(int n) {
        int answer = 0;
        int quot = n / 2;
  
        for(int i = 0; i <= quot; i++) {
            if(n % 2 != 0) {
                answer += 2*i+1;
            } else {
                answer += Math.pow(2*i ,2);
            }
        }
        
        return answer;
    }
}