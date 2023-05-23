class Solution {
    public int[] solution(int[] emergency) {
        
        //순위넣을 배열을 따로 생성
        int[] answer = new int[emergency.length];
    
        for(int i=0; i <= emergency.length-1; i++){
            answer[i] = 1;
            
            for(int j=0; j <= emergency.length-1; j++){
                if(emergency[i] < emergency[j]){
                    answer[i] = answer[i]+1;
                }
            }
        }
        return answer;
    }
}