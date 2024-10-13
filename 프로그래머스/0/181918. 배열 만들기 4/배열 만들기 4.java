import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> solution(int[] arr) {
      List<Integer> stk = new ArrayList<>();
      stk.add(arr[0]);

      for(int i = 1; i < arr.length; i++) {
         while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
            stk.remove(stk.size() - 1);
         }
         stk.add(arr[i]);
      }
      return stk;
   }
}