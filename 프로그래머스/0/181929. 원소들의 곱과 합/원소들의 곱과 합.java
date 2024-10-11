class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum1 = 1; // 원소들의 곱
        int sum2 = 0; // 원소들의 합의 제곱
      
        for(int num : num_list){
            sum1 *= num;
            sum2 += num;
        }
        
        sum2 = (int) Math.pow(sum2, 2);
        answer = sum1 < sum2 ? 1: 0;
        return answer;
    }
}