import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
        List<String> answer = new ArrayList<>();
        
        for(String str : temp){
            if(!str.equals("")){
                answer.add(str);
            }
        }
        
        if(answer.size() == 0){
            answer.add("EMPTY");
        }
        
        return answer.stream().toArray(String[]::new);
    }
}