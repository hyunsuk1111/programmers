import java.util.*;

class Solution {
    public String solution(String s) {        
        String[] temp = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        
        for(int i = 0; i < temp.length; i++){                            
            if(temp[i].length() == 0){
                buffer.append(" ");
            }else{
                buffer.append(temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1, temp[i].length()).toLowerCase()+" ");                
            }
            
        }
        
        String answer = buffer.toString();        
        
        if(s.substring(s.length() - 1, s.length()).equals(" ")){
            return answer;
        }
            
        return answer.substring(0, answer.length() - 1);
    }
}