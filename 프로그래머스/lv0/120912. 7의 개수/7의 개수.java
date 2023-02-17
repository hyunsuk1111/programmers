import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] temp = Arrays.toString(array).replaceAll("[^0-9]","").split("");
        
        for(String i : temp){            
            if(i.equals("7")){
                answer++;
            }
        }
        
        return answer;
    }
}