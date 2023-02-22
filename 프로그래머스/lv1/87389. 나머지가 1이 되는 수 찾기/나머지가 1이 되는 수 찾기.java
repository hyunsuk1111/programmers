class Solution {
    public int solution(int n) {
        int answer = n - 1;
        for(int i = answer; i > 1; i--){
            if(n % i == 1 && answer > i){
                answer = i;
            }
        }
        return answer;
    }
}