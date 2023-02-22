import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int arrLength = 0;
        
        Arrays.sort(arr);
        
        //인덱스확인
        for(int i : arr){
            if(i % divisor == 0){                
                 arrLength++;
            }
        }  
        
        if(arrLength == 0){
            int answer[] = {-1};
            
            return answer;
        }
        
         int[] answer = new int[arrLength]; 
            
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){                
                   answer[j++] = arr[i];                    
            }
        }
   
        return answer;
    }
}