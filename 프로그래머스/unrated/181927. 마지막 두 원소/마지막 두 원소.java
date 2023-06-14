import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int answerLen = answer.length;
        
        answer[answerLen - 1] = answer[answerLen - 2] > answer[answerLen - 3] ? answer[answerLen - 2] - answer[answerLen -3 ] : answer[answerLen - 2] * 2;
        
        return answer;
    }
}