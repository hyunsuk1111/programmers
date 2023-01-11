import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {
        IntStream answer = Arrays.stream(numlist).filter(v -> ((v % n) == 0));
                        
        return answer.toArray();
    }
}