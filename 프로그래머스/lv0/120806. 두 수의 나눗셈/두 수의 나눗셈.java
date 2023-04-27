class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 >0 && num1 <= 100 && num2 > 0 && num2 <= 100){
            double result = (double)num1 / (double) num2;
            // 기본자료형간의 연산은 최소 int타입부터 
            // 업캐스팅은 자동타입변환해서  int + double타입의 연산이면 둘중에 큰 double형으로 결과가 나온다. 굳이 2개항에 형변환을 안시켜도된다는 점!
            answer = (int)(result * 1000);
            return answer;
        }
        
        return -1;
    }
}
