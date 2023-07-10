class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int temp = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                temp++;
            }else{
                temp--;
            }
            
            if(temp < 0){
                return false;
            }
        }
        
        if(temp != 0){
            answer = false;
        }


        return answer;
    }
}