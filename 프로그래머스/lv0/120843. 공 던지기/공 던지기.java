class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        //이걸 반복을 돌릴필요가없는디..왜for문으로 했지..
        for(int i=0; i<2*k; i+=2){
           answer = numbers[i%numbers.length]; \
           //다른 사람풀이..한줄...numbers[((k-1)*2)%numbers.length]
           //내가 쓴 i가 (k-1)*2..!
        }
        return answer;
    }
}
