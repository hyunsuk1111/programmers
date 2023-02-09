class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 2;
        
        while(true){                        
            if(answer * i > n){                
                break; 
            }else{
                answer *= i;
            }
            i++;
        }   
        
        return i - 1;
    }
}