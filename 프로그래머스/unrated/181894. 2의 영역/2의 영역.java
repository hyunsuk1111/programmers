import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){                
                list.add(i);
            }
        }                
        
        if(list.size() != 0){                     
            for(int i = list.get(0); i <= list.get(list.size() - 1); i++){
                answer.add(arr[i]);                
            }
        }else{
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}