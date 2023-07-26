import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int temp = m;
        List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < (score.length / m); i++, temp += m){                                 
            answer += list.get(temp - 1) * m;
        }
        
        
        
        
        return answer;
    }
}