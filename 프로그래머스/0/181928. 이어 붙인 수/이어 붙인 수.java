class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String oddSum = ""; //홀수
        String evenSum = ""; //짝수

        for(int n : num_list){
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        answer = Integer.valueOf(oddSum) + Integer.valueOf(evenSum);
        return answer;
    }
}