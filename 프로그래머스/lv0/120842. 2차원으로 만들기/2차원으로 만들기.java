class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        //int cnt = 0;
        
        for(int i=0; i < num_list.length/n; i++){
            for(int j=0; j < n; j++){
                if(j%n == 0){
                   answer[i][j] = num_list[i*n];                  
                }else if(j%n != 0){
                   answer[i][j] = num_list[(i*n)+j];
                }
                
                //다른 풀이는 for문안에 나처럼 if문으로 안하고..바로
                /*
                answer[i][j] = num_list[cnt];
                cnt++;
                */
            }
        }
        return answer;
    }
}
