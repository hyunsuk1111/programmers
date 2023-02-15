import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = my_string.toLowerCase();
        
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) >= 97 && temp.charAt(i) <= 127){
                temp = temp.replaceAll(temp.substring(i,i+1), " ");                
            }            
        }
        
        String[] tempArr = temp.trim().replaceAll(" +", " ").split(" ");
        
        for(int i = 0; i < tempArr.length; i++){
            if(!"".equals(tempArr[i])){
                answer += Integer.parseInt(tempArr[i]);
            }else{
                answer += 0;
            }
        }
        
        
        return answer;
    }
}