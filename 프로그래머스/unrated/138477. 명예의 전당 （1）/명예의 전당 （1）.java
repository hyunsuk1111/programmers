import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> best = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            if(i < k){
                best.add(score[i]);
                best.sort(Collections.reverseOrder());
                
                answer[i] = best.get(best.size()-1);
            }else{
                best.add(score[i]);
                best.sort(Collections.reverseOrder());
                answer[i] = best.get(k - 1);
            }
        }
        
        return answer;
    }
}