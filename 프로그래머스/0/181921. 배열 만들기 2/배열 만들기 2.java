import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int l, int r) {
      List<Integer> answer = new ArrayList<>();

      //한자리씩 확인
     for (int i = l; i <= r; i++) {
         boolean check = true; 
         char[] chArr = String.valueOf(i).toCharArray();
         for(int j = 0; j < chArr.length; j++) {
            if (!(chArr[j] == '5' || chArr[j] == '0')) {
               check = false;
            }
         }
         
         if (check) {
            answer.add(i);
         }
      }

      
      if(answer.size() == 0) {
         answer.add(-1);
      }
      return answer;
    }
}