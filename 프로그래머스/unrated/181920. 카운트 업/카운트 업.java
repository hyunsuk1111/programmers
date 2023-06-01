import java.util.*;
import java.util.stream.IntStream;

class Solution {
    private int length = 0;
    
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];

        IntStream.rangeClosed(start, end).forEach(i -> {            
            answer[length] = i;
            length++;
        });
        
        return answer;
    }
}