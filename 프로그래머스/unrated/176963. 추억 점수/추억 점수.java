import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int len = 0;
        Map<String, Integer> result = new HashMap<String, Integer>();
        
        for(String str : name){
            result.put(str, yearning[len]);
            len++;
        }
        
        
            for(int i = 0; i < photo.length; i++){
                for(int j = 0; j < photo[i].length; j++){
                    for(String key : result.keySet()){  
                        if(photo[i][j].equals(key)){
                            answer[i] = answer[i] + result.get(key).intValue();
                        }//if                         
                    }//for keySet                                                            
                }//for j
            }//for i
        
        return answer;
    }
}