import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        List<Integer> result = IntStream.of(num_list).boxed().collect(Collectors.toList());
        
        answer = result.contains(n) ? answer + 1 : 0;
        
        return answer;
    }
}