import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = 0;i < code.length(); i++){
            char c = i % q == r ? code.charAt(i) : ' ';
            answer.append(c);
        }
        
        
        return answer.toString().replaceAll(" ", "");
    }
}