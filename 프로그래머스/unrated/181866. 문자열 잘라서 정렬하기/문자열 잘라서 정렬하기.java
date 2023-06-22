import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replace("x", " ").split(" ");
        List<String> result = new ArrayList<>();
        
        for(String str : answer){
            if(!"".equals(str)){
                result.add(str);
            }
        }
        
        
        Collections.sort(result);
        
        return result.stream().toArray(String[]::new);
    }
}