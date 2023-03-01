import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(int left, int right) {        
      Map<Integer,Integer> temp = new HashMap<>();
       int answer = 0;
        
        for(; left <= right; left++){
            int count = 0;
            for(int i = 1; i <= left; i++){
                if(left % i == 0){
                    count++;                  
                }
            }
            temp.put(left, count);
        }
        
        for (Entry<Integer, Integer> pair : temp.entrySet()) {
            if(pair.getValue() % 2 == 0){
                answer += pair.getKey();
            }else{
                answer -= pair.getKey();
            }
        }
        
        return answer;
    }
}