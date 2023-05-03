class Solution {
    public int solution(int[] array) {
        //최빈값
        int answer = 0;
        
        //숫자가 나온 횟수값(counting) 0~999
        int[] count = new int[1000];
        
        //최댓값(조건..을 위한 / 나중에 최빈값이 여러개일 경우를 가려내기위함)
        int max = 0;
        
        for(int i=0; i<array.length; i++){
            //counting 시작!
            count[array[i]]++;
        }
        
        //counting한 최댓값을 구하기
        for(int i=0; i<count.length; i++){
            if(max < count[i]){
               max = count[i];
               answer = i; 
            }else if(max == count[i]){
               answer = -1;
            } 
        }
        
        return answer;
    }
}