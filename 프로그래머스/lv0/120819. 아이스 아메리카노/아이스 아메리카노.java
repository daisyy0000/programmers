class Solution {
    public int[] solution(int money) {
        //커피잔 수
        int cup = 0;
        
        //아메리카노(아메리카노 가격이 수시로 바뀐다는 가정에..바로 숫자로 적으면..나중에 수정할떄..복잡해지니깐!일단 변수로 담아두자..)
        int coffee = 5500;
        
        //잔돈
        int change = money;
        
        if(money >= coffee){
        cup = money / coffee;
        change = money - coffee * cup;
        }
       
        int[] answer = {cup, change};
        return answer;
        
        //다른 사람들의 풀이
        /*
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;

        */
    }
}