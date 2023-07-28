class Solution {
    public int solution(String s) {
        int answer = 0;
        int firstCnt = 1;
        int secondCnt = 0;
        
        while(s.length() != 0){
            firstCnt = 1;
            secondCnt = 0;
            answer++; 
            
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(0) == s.charAt(i)){
                    firstCnt++;
                }else{
                    secondCnt++;
                }
                
                if(firstCnt == secondCnt){
                    break;
                }
            }
            s = s.substring(firstCnt + secondCnt);
        }
        return answer;
    }
}