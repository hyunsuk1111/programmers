import java.util.*; 

class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sumPow = 0;
        
        for(int i : num_list){
            multiple *= i;
            sumPow += i;
        }
        
        return multiple > Math.pow(sumPow, 2) ? 0 : 1;
    }
}