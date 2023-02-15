import java.util.*;
import java.util.Map.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {        
        String answer = "";        
        String[] temp = s.split("");
        Map<String,Integer> map = new HashMap<>();
                              
        for(String i : temp){            
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, 2);
            }
        }
        for(Entry<String, Integer> el : map.entrySet()){
            if(el.getValue() == 1){
                answer += el.getKey();
            }
        }                              
        return Stream.of(answer.split(""))
                    .sorted()
                    .collect(Collectors.joining());
    }
}