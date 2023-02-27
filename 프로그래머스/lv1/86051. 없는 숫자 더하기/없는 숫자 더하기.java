import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //0 ~ 9의 값은 45
        final int answer = 45;
        int result = 0;
        
        for(int i : numbers){
            result += i;
        }                
                
        return answer - result;
    }
}