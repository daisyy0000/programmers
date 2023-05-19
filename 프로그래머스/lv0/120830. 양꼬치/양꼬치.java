class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int lamb = 12000;
        int drink = 2000;
        
        int service = n / 10;
        
        answer = (lamb * n) + (drink * k) - (drink * service);
        return answer;
    }
}