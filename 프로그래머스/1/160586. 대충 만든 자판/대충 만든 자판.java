import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> result = new HashMap<>();
        
        //keymap에서 문자열 1개 가져오기
        for(String s : keymap){
            //문자열의 자릿수 만큼 반복
            for(int i = 0; i < s.length(); i++){                                
                //hashMap에 문자를 넣을 때 없으면 그냥 put
                //                       있으면 문자에 해당하는 값(idx) 가져와 비교해서 작은 값(idx)으로 넣기
                result.put(s.charAt(i), Math.min(result.getOrDefault(s.charAt(i), i + 1), i + 1));
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0 ; j < targets[i].length(); j++){
                //map에 target에 문자열이 없다면 -1 넣고 종료
                if(!result.containsKey(targets[i].charAt(j))){
                    answer[i] = -1;
                    break;
                }else{ //map 에 담긴 키에 해당하는 값을 계속 더해주기
                    answer[i] += result.get(targets[i].charAt(j));
                }
            }
        }
        
        
        return answer;
    }
}