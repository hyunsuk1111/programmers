class Solution {
    int answer = 0;    
    public int solution(int[] nums) {        
          for(int i = 0; i < nums.length - 2; i++){              
            for(int j = i + 1; j < nums.length - 1; j++) {                
                for(int k = j + 1; k < nums.length; k++) {                                    
                   answer = calc(nums[i] + nums[j] + nums[k]) ? (answer + 1) : (answer + 0);
                    // answer += calc(nums[i] + nums[j] + nums[k]) ? 1 : 0;
                }//for k
             }//for j 
          }//for i

        return answer;
    }
    
     private boolean calc(int calcParam){  
            for(int i = 2 ; i <= Math.sqrt(calcParam); i++){
                if(calcParam % i == 0){                    
                    return false;                    
                }
            }
         return true;
     }
        
}