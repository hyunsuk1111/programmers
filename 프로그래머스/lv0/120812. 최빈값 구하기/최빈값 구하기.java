import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxValue = -1;
        int preMaxIndex = -1;
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i : array){
            if(!temp.containsKey(i)){
                temp.put(i, 1);
            }else {
                temp.put(i, temp.get(i) + 1);
            }
        }    
        for(int key : temp.keySet()){
            if(maxValue < temp.get(key)){
                maxValue = temp.get(key);
                answer = key;
            }
            else if (maxValue == temp.get(key)){
                preMaxIndex=key;
            }
        }
        if(temp.get(answer) ==temp.get(preMaxIndex)){
            answer= -1;
            return answer;
        }
             
        return answer;
    }
}