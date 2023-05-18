class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        while(true){
            if(n < a){
                break;
            }
            if(n % 2 == 0){
                
            }            
            answer = answer + (n / a) * b;
            temp = n % a; 
            n = (n / a) * b + temp;
        }
        return answer;
    }
}