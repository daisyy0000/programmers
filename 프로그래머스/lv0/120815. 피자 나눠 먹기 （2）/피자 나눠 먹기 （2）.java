import java.math.*;

class Solution {
    public int solution(int n) {
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