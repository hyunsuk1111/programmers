class Solution {
    public String solution(String my_string, int s, int e) {        
        String temp = my_string.substring(s,e+1);
        String tempStr = "";
        
        for(int i = temp.length() - 1; i >= 0 ; i--){
            tempStr += String.valueOf(temp.charAt(i));
        }
        
        return my_string.substring(0 , s) + tempStr + my_string.substring(e + 1);
    }
}