import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;                     
        int index = 0;
        Map<Integer, Integer> result = new TreeMap<>();
        int[] tempArr = new int[3];
                
        for(int i = 0 ; i < attendance.length; i++){
            if(attendance[i] == true){
                result.put(rank[i], i);        
            }
        }
        
        Object[] resultSort = result.keySet().toArray();
        Arrays.sort(resultSort);
        
		for (Integer nKey : result.keySet()){
            tempArr[index] = result.get(nKey);
            
            if(index == 2){
                break;
            }

			index++;
		}
    		        
        return (tempArr[0] * 10000) + (tempArr[1] * 100) + tempArr[2];
    }
}