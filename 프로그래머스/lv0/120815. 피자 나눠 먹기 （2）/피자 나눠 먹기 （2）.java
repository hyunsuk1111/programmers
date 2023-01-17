class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        
        while(true){
            if(pizza % n == 0){                
                break;
            }
            
            pizza += 6;
            answer++;
        }
        
        return answer;
    }
}