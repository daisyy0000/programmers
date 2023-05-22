class Solution {
    public String solution(int age) {
        String answer = "";
        
        String ageRange = "abcdefghij"; //0~9
        
        //int-> String 배열로 ex. {십의자리, 일의자리}
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i=0; i < ageArr.length; i++){
            //이걸 다시 int로
            answer += ageRange.charAt(Integer.valueOf(ageArr[i]));
        }
        
        return answer;
    }
}