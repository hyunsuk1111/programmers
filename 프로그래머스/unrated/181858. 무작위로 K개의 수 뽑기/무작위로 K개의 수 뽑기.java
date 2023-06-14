import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {                
        List<Integer> result = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        int index = result.size();
                        
        if(index > k){
            result.subList(k, result.size()).clear();
        }else{
            for(int i = index; i < k; i++){
                result.add(-1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}