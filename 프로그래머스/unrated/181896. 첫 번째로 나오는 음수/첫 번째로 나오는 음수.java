import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int index = 0;
        int answer = -1;
        
        for(int i : num_list){
            if(i < 0){
                answer = index;   
                break;
            }            
            index++;            
        }       
        
        return answer;
    }
}