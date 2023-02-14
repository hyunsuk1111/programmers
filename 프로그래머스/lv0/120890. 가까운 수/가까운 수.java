import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            if(array[i] <= n){
                continue;
            }else{                
                int temp1 = Math.abs(n - array[i - 1]);
                int temp2 = Math.abs(n - array[i]);
                
                if(temp1 > temp2){
                    answer = array[i];
                    return answer;
                }else if(temp1 < temp2 || temp1 == temp2){
                    answer = array[i -1];
                    return answer;
                }
                
            }
        }                       
        return array[array.length - 1];
    }
}