import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> countTangerineMap=new HashMap<>();
        
        for(int number : tangerine){
            countTangerineMap.put(number, countTangerineMap.getOrDefault(number, 0) + 1);
        }
        
        List<Integer> list=new ArrayList<>(countTangerineMap.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(Integer number : list){
            k -= number;
            answer++;
            
            if(k < 1){
                return answer;
            }
        }
        
        return answer;
    }
}