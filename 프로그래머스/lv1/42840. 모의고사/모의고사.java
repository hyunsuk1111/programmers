import java.util.*;

class Solution {
    
    public int[] solution(int[] answers) {
        // 10문제 패턴
		int[] firstP  = { 1, 2, 3, 4, 5};
		int[] secondP = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] thirdP  = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
		int[] answer = {0,0,0};        
        int[] best = {};
        
        for(int i = 0 ; i < answers.length; i++){
            if(firstP[i % 5] == answers[i]){
                answer[0]++;
            }
            if(secondP[i % 8] == answers[i]){
                answer[1]++;
            }
            if(thirdP[i % 10] == answers[i]){
                answer[2]++;
            }
        }
        
        int max = Math.max(Math.max(answer[0], answer[1]),answer[2]);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == answer[0]){
          list.add(1);  
        } 
        if(max == answer[1]){
          list.add(2);  
        }
        if(max == answer[2]){
          list.add(3);  
        }
        
        best = new int[list.size()];
        
        for(int i = 0; i < best.length; i++) {
        	best[i] = list.get(i);
        }
      return best;
    }
}