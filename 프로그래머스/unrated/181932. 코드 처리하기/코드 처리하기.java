class Solution {
    public String solution(String code) {
        String answer = "";
        String[] tempArr = code.split("");
        String mode = "0";
        int index = 0;
        
        for(int i = 0; i < tempArr.length; i++){
            if(tempArr[i].equals("1")){
                index++;
                if(index % 2 != 0){
                    mode = "1";
                }else{
                    mode = "0";
                }
            }
            
            if(mode.equals("0")){
                if(i % 2 == 0 && !tempArr[i].equals("1")){
                    answer += tempArr[i];    
                }                
            }else{
                if(i % 2 != 0 && !tempArr[i].equals("1")){
                    answer += tempArr[i];    
                }
            }
        }
        
        answer = answer.length() == 0 ? "EMPTY" : answer;
        
        return answer;
    }
}