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

#if(6 * pizza % n ==0) 으로 수정가능
