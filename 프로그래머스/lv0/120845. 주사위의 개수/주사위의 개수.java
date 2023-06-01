class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int count = 1;
        
        for(int i=0; i<box.length; i++){
            count *= box[i] / n;
        }
        answer = count;
        return answer;
    }
}