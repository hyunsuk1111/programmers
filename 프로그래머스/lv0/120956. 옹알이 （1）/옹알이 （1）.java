class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str = "";
        
        for(int i = 0 ; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "z");
            babbling[i] = babbling[i].replace("ye",  "z"); 
            babbling[i] = babbling[i].replace("woo", "z");
            babbling[i] = babbling[i].replace("ma",  "z");                        
            str = babbling[i].replace("z", "");
            
            if(str.length() == 0){
            answer++;
        }
        }
        
        
    
        return answer;
    }
}