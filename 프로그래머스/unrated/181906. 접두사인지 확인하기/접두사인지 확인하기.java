class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(is_prefix.length() > my_string.length()){
            return answer;
        }else{
            for(int i = 0; i < is_prefix.length(); i++){
                if(is_prefix.charAt(i) != my_string.charAt(i)){
                    return answer;
                }                
            }
        }
        return 1;
    }
}