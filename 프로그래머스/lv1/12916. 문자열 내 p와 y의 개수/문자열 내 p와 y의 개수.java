import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        //문자열 슬라이싱
        String[] array = s.split("");
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("P") || array[i].equals("p")){
                pCount++;
            }else if(array[i].equals("y") || array[i].equals("Y")){
                yCount++;
            }
            
        }
        if(pCount == yCount){
            answer = true;
        }

        return answer;
    }
}