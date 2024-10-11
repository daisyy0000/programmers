class Solution {
    public int[] solution(int[] num_list) {
      int len = num_list.length;
      int[] answer = new int[len + 1];

      System.arraycopy(num_list, 0, answer, 0, len);

      int idx1 = num_list[len - 1];
      int idx2 = num_list[len - 2];

      if(idx1 > idx2 ){
         answer[len] = idx1 - idx2;
      } else if( idx2 >= idx1 ) {
         answer[len] = idx1 * 2;
      }
      return answer;
    }
}