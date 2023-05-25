class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int jangGun = 5;
        int byeongjeong = 3;
        int il = 1;
         
        int quotient1 = hp / jangGun;
        int remainder1 = hp % jangGun;
        
        int quotient2 = 0;
        int remainder2 = 0;
 
        if(remainder1 != 0 || quotient1 == 0){
            quotient2 = remainder1 / byeongjeong; 
            remainder2 = remainder1 % byeongjeong;
        }
            
        answer = quotient1 + quotient2 + remainder2;
        
        //한줄좌..answer = hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        return answer;
    }
}