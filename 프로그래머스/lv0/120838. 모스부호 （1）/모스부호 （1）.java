import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");

        for(String arr : letterArr ){
            for(int i=0; i<morseList.length; i++){
                if(arr.equals(morseList[i])) {
                    answer+=(char)(i+97); //아스키코드(+92)
                }
            }
        }

        return answer;
        
       
    }
}