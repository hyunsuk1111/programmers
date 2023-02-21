import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] temp = String.valueOf(n).split("");
        
        Arrays.sort(temp, Collections.reverseOrder());

        return Long.parseLong(String.join("", temp));
    }
}