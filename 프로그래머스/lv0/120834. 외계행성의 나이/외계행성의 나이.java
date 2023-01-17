class Solution {
    final int ageAlphabet = 97;
    
    public String solution(int age) {
        String[] tempArray = String.valueOf(age).split("");
        String answer = "";
                           
        for(int i = 0; i < tempArray.length; i++){
             answer += String.valueOf((char) (Integer.parseInt(tempArray[i]) + ageAlphabet));
        }
        
        return answer;
    }
}