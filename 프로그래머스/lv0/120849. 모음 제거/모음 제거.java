import java.util.*;

class Solution {
    public String solution(String my_string) {            
        String pattern = "[aeiou]";
                        
        return my_string.replaceAll(pattern, "");
    }
}