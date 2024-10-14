class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2]; 
            
            int minVal = -1;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (minVal == -1 || arr[j] < minVal) {
                        minVal = arr[j]; // 첫 유효 값이거나 더 작은 값일 때 업데이트
                    }
                }
            }
            
            answer[i] = minVal;
        }
        
        return answer;
    }
}
