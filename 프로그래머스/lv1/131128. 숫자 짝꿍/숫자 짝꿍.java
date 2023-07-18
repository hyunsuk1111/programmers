import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuffer sb = new StringBuffer();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(String s : Y.split("")){
            map.put(s , map.getOrDefault(s , 0) + 1);
        }
        
        for(String s : X.split("")){
            if(map.containsKey(s) && map.get(s) > 0){
                map.put(s, map.get(s) - 1);
                list.add(s);
            }
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        if(list.size() == 0){
            return "-1";
        }
        
        if("0".equals(list.get(0))){
            return "0";
        }
        
        for(int i = 0 ; i < list.size(); i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}