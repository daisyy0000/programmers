class Solution {
   public String solution(String my_string, int[][] queries) {
      for(int[] query : queries){
         int s = query[0];
         int e = query[1];

         String left = my_string.substring(0, s);    
         String middle = new StringBuffer(my_string.substring(s, e + 1)).reverse().toString();  
         String right = my_string.substring(e + 1);   
         
         my_string = left + middle + right;
      }
      return my_string;
   }
}