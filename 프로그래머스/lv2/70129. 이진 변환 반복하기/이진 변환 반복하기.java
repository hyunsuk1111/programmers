import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        long zeroCnt = 0;
        int sum = 0;
        int cnt = 0;
        while(true){
            zeroCnt = s.chars().filter(c -> c == '0').count();     
            sum += zeroCnt;
            s = Integer.toBinaryString(s.length() - (int) zeroCnt);                        
            cnt++;
            
            if(s.length() == 1){
                answer[0] = cnt;
                answer[1] = sum;
                
                break;
            }
            
        }
                                
        return answer;
    }
}