import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < index_list.length; i++){
            result.add(String.valueOf(my_string.charAt(index_list[i])));
        }
        
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }
}