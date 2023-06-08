import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        String[] arr = my_string.replaceAll("[^0-9]","").split("");
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}