import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();            
        int answer  = 0;
        
        for(int pkm : nums){
            set.add(Integer.valueOf(pkm));
        }
                        
        return set.size() > (nums.length / 2) ? (nums.length / 2) : set.size();
    }
}