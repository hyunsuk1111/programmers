class Solution {
    final int cutting = 7;
    
    public int solution(int n) {
        int answer = (n % cutting) == 0 ? (n / cutting) : (n / cutting) + 1;
                       
        return answer;
    }
}