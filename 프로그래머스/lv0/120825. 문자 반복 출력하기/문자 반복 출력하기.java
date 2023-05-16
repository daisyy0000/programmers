class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i < my_string.length(); i++){
 
            char str =  my_string.charAt(i); 
            String stringStr = String.valueOf(str);
            String str2 =  stringStr.repeat(n); 
            answer += str2;
        }
        return answer;
    }
}