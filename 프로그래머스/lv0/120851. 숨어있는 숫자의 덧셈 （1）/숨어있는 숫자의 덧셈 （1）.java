class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arrString = my_string.replaceAll("[^0-9]", "").split("");
        int[] arrAnswer = new int [arrString.length];
        
        for(int i=0; i<arrString.length; i++){
            arrAnswer[i] = Integer.parseInt(arrString[i]);
        }
        
        for(int i=0; i<arrAnswer.length; i++){
            answer += arrAnswer[i];
        }
        
        return answer;
    }
}