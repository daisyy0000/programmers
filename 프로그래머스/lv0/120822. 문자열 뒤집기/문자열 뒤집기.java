class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = my_string.length()-1; i >= 0; i--){
            answer = answer + my_string.charAt(i);
        }
        return answer;
        
        //다른사람들 풀이(StringBuilder이용해서..! ㅜ한줄로 딱!!)
        //return new StringBuilder(myString).reverse().toString();
    }
}