import java.util.*;

class Solution {
    public String solution(String s) {        
        StringBuffer buffer = new StringBuffer();
        String[] tempArr = s.split(" ");
        
        List<Integer> list = new ArrayList<>();
        
        for(String str : tempArr){
            list.add(Integer.parseInt(str));
        }
        
        buffer.append(String.valueOf(Collections.min(list)));        
        buffer.append(" ");        
        buffer.append(String.valueOf(Collections.max(list)));
           
        return buffer.toString();
    }
}