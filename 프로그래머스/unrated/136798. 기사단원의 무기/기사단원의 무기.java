import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
        for(int i = 1; i <= number; i++){
            for(int j = 1; j * j <= i; j++){
                if(j * j == i){
                    answer++;
                }else if(i % j == 0){
                    answer += 2;
                    
                }
            }            
            if(answer > limit){
                arr[i - 1] = power;
            }else{
                arr[i - 1] = answer;
            }
            answer = 0;
        }
                
        return Arrays.stream(arr).sum();
    }
}