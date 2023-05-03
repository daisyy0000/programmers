class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    
        //분자
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        //분모
        int denom = denom1 * denom2;
            
        //최대공약수
        int max = 1;
        
        for(int i=1; i<=denom; i++){
            if( numer % i == 0 && denom % i == 0){
                max = i;
            }
        }
        int[] answer = {(numer/max), (denom/max)};
        return answer;
    }
}