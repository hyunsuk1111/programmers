class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] temp = s.split(" ");
        
        for(int i = 0; i < temp.length; i++){
            if(!"Z".equals(temp[i])){
                answer += Integer.parseInt(temp[i]);
            }else{
                answer -= Integer.parseInt(temp[i-1]);
            }
        }
        
        
        return answer;
    }
}