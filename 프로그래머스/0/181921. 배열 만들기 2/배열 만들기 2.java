import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int l, int r) {
      List<Integer> answer = new ArrayList<>();

      for(int i = l; i <= r; i++) {
         boolean check = true;
         int j = i;
         
         // 다른 방법: 숫자들이 5의 배수
         while(j > 0){
            if(j % 5 != 0) {
               check = false;
               break;
            }
            j /= 10;
         }
         
         if(check) {
            answer.add(i);
         }
      }

      
      if(answer.size() == 0) {
         answer.add(-1);
      }
      return answer;
    }
}