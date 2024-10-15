import java.util.ArrayList;
import java.util.List;

class Solution {
   public List<Integer> solution(String[] intStrs, int k, int s, int l) {
      List<Integer> answer = new ArrayList<>();

      for (int i = 0; i < intStrs.length; i++) {
         String subStr = intStrs[i].substring(s, s + l);
         int num = Integer.valueOf(subStr); 

         if (num > k) {
            answer.add(num);
         }
      }
      return answer;
   }
}
