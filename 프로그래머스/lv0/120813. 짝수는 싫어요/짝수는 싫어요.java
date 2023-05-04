class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        //(보완) 방법1: 처음부터 배열의 크기를 지정, 안에들어가는건 똑같이 홀수니깐(똑같은 코드 발생)
      
        /*
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }
        
        for (int i = 0; i < answer.length; i++) {
                answer[i] = (i * 2) + 1;
            }
        return answer;
        */
        
        
        //(보완) 방법2: ArrayList로
        
        /*
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
          if(i%2 != 0) {
              answer.add(i);
          } 
        }
        return answer;         //(그냥참고만..) 배열로 자료구조 바꾸는 코드: answer.stream().mapToInt(x -> x).toArray();
       */
        
        
        //n이 짝수일 경우
        if(n % 2 == 0){
            answer = new int[n/2];
            for(int i=0; i < n/2; i++){
                answer[i] = (2*i)+1;
            }
        //n이 홀수인 경우
        }else if(n % 2 != 0){
            answer = new int[(n/2)+1];
            for(int i=0; i <= n/2; i++){
                answer[i] = (2*i)+1;
            }
        }
        return answer;
    }
}
