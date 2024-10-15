import java.util.Arrays;

class Solution {
   public int solution(String my_string, String is_suffix) {
      int answer = 0;
      answer = my_string.endsWith(is_suffix) ? 1 : 0;
       
      //endsWith 안쓰면
     /* String[] arr = new String[my_string.length()];
      arr[0] = my_string;

      for(int i=1; i<my_string.length(); i++) {
         arr[i] = my_string.substring(i);
      }

      for(String str : arr) {
         if(str.equals(is_suffix)) {
            answer = 1;
            break;
         }
      }*/
      return answer;
   }
}