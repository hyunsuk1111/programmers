import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int temp = 0;        
        
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = i;
                }else{
                    temp = j;
                }
            }
        }
        
        answer[0] = array[temp];
        answer[1] = temp;
        
        return  answer;
    }
}