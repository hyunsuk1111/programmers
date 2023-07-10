class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            answer = 0;
            for(int j = i; j <= n; j++){
                answer += j;                
                if(answer == n){                                        
                    count++;
                    continue;
                }
                
                if(answer > n){                    
                    break;
                }
            }
        }
        
        return count;
    }
}