import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        
        for(int i = 0; i < my_string.length(); i++){
            if('a' <= my_string.charAt(i) && 'z' >= my_string.charAt(i)){                               
                answer[((int) my_string.charAt(i) - 97) + 26]++;            
            }else{                
                answer[(int) my_string.charAt(i) - 65]++;                
            }
            
        }
        
        return answer;
    }
}