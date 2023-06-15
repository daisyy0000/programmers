import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i < my_string.length(); i++){
            //indexOf: 지정한 값이 처음으로 발견되는 위치
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}