class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) {
				answer += String.valueOf(my_string.charAt(i)).toLowerCase();
				
			}else if(my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
				answer += String.valueOf(my_string.charAt(i)).toUpperCase();
			}
		}
        
        return answer;
    }
}