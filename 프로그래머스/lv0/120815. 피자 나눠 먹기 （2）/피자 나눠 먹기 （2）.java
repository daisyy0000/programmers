import java.math.*;

class Solution {
    public int solution(int n) {
        
        // 다른사람들 풀이..(나는 언제쯤 간단하게 짤 수 있을까..)
        /*
        int answer = 1;

       while(true){
            if(6 * answer % n == 0){
                break;
            }
            answer++;
        }
        return answer;
        */
            
        
        int answer = 0;
        int pizza = 6;
        
        //최대공약수(GCD)
        BigInteger biN = BigInteger.valueOf(n); 
        BigInteger biPizza = BigInteger.valueOf(pizza); 
        BigInteger biGcd = biN.gcd(biPizza); 
            
        int gcd = biGcd.intValue();
        
        //최소공배수(LCM)
        int lcm = (n * pizza) / gcd;
        
        answer = lcm / pizza;
        
        return answer;
    }
}
