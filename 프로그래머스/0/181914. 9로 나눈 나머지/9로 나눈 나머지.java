import java.math.BigInteger;

class Solution {
   public int solution(String number) {
      BigInteger b = new BigInteger(number);
      return b.mod(BigInteger.valueOf(9)).intValue(); //BigInteger는 나머지연산자 사용불가(객체형이니깐)
   }
}