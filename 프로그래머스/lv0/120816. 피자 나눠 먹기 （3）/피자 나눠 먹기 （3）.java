class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0){
         answer = n / slice;   
        }else if(n % slice != 0){
         answer = (n / slice) +1;   
        }
        
        //다른풀이: 삼항연산자
        //return n % slice > 0 ? n/slice+1 : n/slice;

        return answer;
    }
}
