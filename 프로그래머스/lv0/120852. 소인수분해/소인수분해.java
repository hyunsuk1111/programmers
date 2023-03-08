import java.util.*;

class Solution {
    public int[] solution(int n) {
       HashSet<Integer> temp = new HashSet<>();
       
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                temp.add(i);
                n /= i;
            }
        }

        return temp.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}