class Solution {
    public int solution(String my_string) {        
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            int temp = my_string.charAt(i); 
            
            if (!((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122))) {
				answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
			}
            
        }
        return answer;
}
}