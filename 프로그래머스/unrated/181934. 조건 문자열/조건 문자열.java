class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        StringBuffer str = new StringBuffer();
        
        str.append(ineq);
        str.append(eq);
        if(str.toString().equals(">=")){
            if(n >= m){
                answer = 1;
            }
        }else if(str.toString().equals("<=")){
            if(n <= m){
                answer = 1;
            }
        }else if(str.toString().equals(">!")){
            if(n > m){
                answer = 1;
            }
        }else if(str.toString().equals("<!")){
            if(n < m){
                answer = 1;
            }
        }       
        
        return answer;
    }
}