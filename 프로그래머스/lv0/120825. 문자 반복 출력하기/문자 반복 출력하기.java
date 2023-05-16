class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i < my_string.length(); i++){
 
            char str =  my_string.charAt(i); 
            String stringStr = String.valueOf(str);
            String str2 =  stringStr.repeat(n); 
            answer += str2;
        }
        
         //다른사람들 풀이: 애초에 split으로 String 배열로 만들었음!
         /*
         String[] str = my_string.split("");
         for(int i=0; i<my_string.length(); i++){
           answer += str[i].repeat(n);
         }
         */
        
        return answer;
    }
}
