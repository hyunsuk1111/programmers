import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer strBuffer = new StringBuffer();        
        String[] tempArr = s.split("");
        
        for(int i = 0; i < tempArr.length; i++){            
            char chr = tempArr[i].charAt(0);            
            
            for(int j = 0 ; j < index; j++){              
              chr += 1;
              if(chr > 'z'){
                  chr -= 26;
              }    
                
              if(skip.contains(String.valueOf(chr))){
                j--;
              }//if                                                 
            }//for j
            strBuffer.append(chr);
        }

        return strBuffer.toString();
    }
}