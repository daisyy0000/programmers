class Solution {
   public int[] solution(int[] arr, int[][] queries) {
      for (int i = 0; i < queries.length; i++) {
        int from = queries[i][0];
        int to = queries[i][1];
        int multiple = queries[i][2];

        for(int j = from; j <= to; j++){
            if(j % multiple == 0){
                arr[j] += 1;
            }
         }
      }
      return arr;
   }
}