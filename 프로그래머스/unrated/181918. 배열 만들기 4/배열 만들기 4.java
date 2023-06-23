import java.util.*;

class Solution {
    public int[] solution(int[] arr) {         
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length;){
            if(result.size() == 0){                
                result.add(arr[i]);    
                 i++;
            }else if(result.size() != 0 && arr[i] > result.get(result.size() - 1)){
                result.add(arr[i]);
                 i++;
            }else{
                result.remove(result.size() - 1);
            }               
        }
   
        return result.stream().mapToInt(i -> i).toArray();
    }
}