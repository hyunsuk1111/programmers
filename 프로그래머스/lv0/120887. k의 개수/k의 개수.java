import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        
        for(;i <= j; i++){
            String temp = Integer.toString(i);   
            for(int t = 0 ; t < temp.length(); t++){
                if((String.valueOf(k).equals(temp.substring(t,t+1)))){
                    answer++;
                }
            }
            
        }
               
        return answer;
    }
}