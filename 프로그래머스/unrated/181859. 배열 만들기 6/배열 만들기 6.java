import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
                                
        for(int i = 0; i < arr.length; i++){
            if(result.isEmpty()){
                result.add(arr[i]);
            }else if(result.get(result.size() - 1) != arr[i]){
                result.add(arr[i]);
            }else{
                result.remove(result.size() - 1);
            }
        }
        
        
        if(result.isEmpty()){
            result.add(-1);
        }
                                
        return result.stream().mapToInt(i -> i).toArray();
    }
}