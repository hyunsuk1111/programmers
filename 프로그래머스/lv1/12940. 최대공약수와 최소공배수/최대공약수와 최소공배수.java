class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcdNum = n * m;
        int temp = 0;       
        
         if(m < n) {
            temp = n;
            n = m;
            m = temp;
        }
        
        while(n != 0){                        
            int divide = m % n;
            m = n;
            n = divide;
            
        }        
        answer[0] = m;        
        answer[1] = gcdNum / m;
        
        return answer;
    }
}